package classes.multimidias;

public class LivroFisico extends Multimidia{
    // Atributos da classe
    private String isbn;
    private int edicao;
    private int nCopias;
    private int nCopiasDisponiveis;
    private String localizacao;
    private String estadoConservacao;


    //Construtor
    public LivroFisico(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String imagem, String isbn, int edicao, int nCopias, int nCopiasDisponiveis, String localizacao, String estadoConservacao) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem);
        this.isbn = isbn;
        this.edicao = edicao;
        this.nCopias = nCopias;
        this.nCopiasDisponiveis = nCopiasDisponiveis;
        this.localizacao = localizacao;
        this.estadoConservacao = estadoConservacao;
    }

    //Getters para acessar os atributos privados
    public int getEdicao() {
        return edicao;
    }


    public String getIsbn() {
        return isbn;
    }

    //Método
    public void determinarEmprestimo(){
        System.out.println("O livro foi emprestado!");
    }
}
