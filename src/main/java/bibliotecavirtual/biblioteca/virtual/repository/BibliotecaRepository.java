package bibliotecavirtual.biblioteca.virtual.repository;

import bibliotecavirtual.biblioteca.virtual.model.BibliotecaModel;
import org.springframework.data.repository.CrudRepository;

public interface BibliotecaRepository extends CrudRepository<BibliotecaModel, Integer> {
}
