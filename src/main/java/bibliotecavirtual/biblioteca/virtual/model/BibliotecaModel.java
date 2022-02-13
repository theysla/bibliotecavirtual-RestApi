package bibliotecavirtual.biblioteca.virtual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "biblioteca")
public class BibliotecaModel {

    @Id
    public Integer codigo;

    @Column(nullable = false, length = 50)
    public String nomelivro;

    @Column(nullable = false, length = 30)
    public String generolivro;

    @Column(nullable = false, length = 50)
    public String autor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomelivro() {
        return nomelivro;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public String getGenerolivro() {
        return generolivro;
    }

    public void setGenerolivro(String generolivro) {
        this.generolivro = generolivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
