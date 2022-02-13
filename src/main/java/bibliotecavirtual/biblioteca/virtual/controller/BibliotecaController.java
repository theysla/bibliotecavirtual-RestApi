package bibliotecavirtual.biblioteca.virtual.controller;

import bibliotecavirtual.biblioteca.virtual.model.BibliotecaModel;
import bibliotecavirtual.biblioteca.virtual.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BibliotecaController {

    @Autowired
    private BibliotecaRepository repository;

    @GetMapping(path = "api/livro/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }

    @PostMapping(path = "/api/biblioteca/salvar")
    public BibliotecaModel salvar(@RequestBody BibliotecaModel biblioteca) {
        return repository.save(biblioteca);
    }

}
