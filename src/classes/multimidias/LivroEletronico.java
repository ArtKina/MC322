package classes.multimidias;

public class LivroEletronico {
    // Atributos da classe
    private String formato;
    private int numeroLicencas;
    private String url;
    private String requisitos;
    private String dataDisponibilidade;

    //Construtor
    public LivroEletronico(String titulo, int edicao, String autor, String isbn, String situacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.isbn = isbn;
        this.situacao = situacao;
    }

    //Getters para acessar os atributos privados
    public String getTitulo() {
        return titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String novaSituacao) {
        situacao = novaSituacao;
    }

    //Método
    public void determinarEmprestimo(){
        System.out.println("O livro foi emprestado!");
    }
}
