package classes;

public class Livro{
    // Atributos da classe
	public String titulo;
	public int edicao;
	public String autor;
	public String isbn;

    //Construtor
    public Livro(String titulo, int edicao, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.isbn = isbn;
    }
}
