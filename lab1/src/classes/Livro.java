package classes;

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
}
