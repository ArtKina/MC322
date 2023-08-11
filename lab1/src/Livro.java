public class Livro{
    // Atributos da classe
    private String titulo;
    private int edicao;
    private String autor;
    private String isbn;
    
    //Construtor
    public Livro(String titulo, int edicao, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.isbn = isbn;
    }
}