package classes.multimidias;

public class CD extends Multimidia{
    // Atributos da classe
    private String[] listaFaixas; 
    private int duracaoTotal;
    private int nCopias;
    private int nCopiasDisponiveis;
    private String estadoConservacao;

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
