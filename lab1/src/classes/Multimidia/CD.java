package classes.Multimidia;

public class CD {
    // Atributos da classe
    private String id;
    private String titulo;
    private String autor;

    //Construtor
    public CD(String id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters para acessar os atributos privados
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setFuncao(String novaFuncao) {
        autor = novaFuncao;
    }
}
