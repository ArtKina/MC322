package classes.multimidias;

public class DVD {
    // Atributos da classe
    private String listaFaixas;
    private int duracaoTotal;
    private int numeroCopias;
    private int nCopiasDisponiveis
    private String legendas;
    private String audio;
    private String estadoConservacao;

    //Construtor
    public DVD(String id, String titulo, String autor) {
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
