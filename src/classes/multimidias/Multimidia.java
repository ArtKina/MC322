package classes.multimidias;

abstract class Multimidia {
	private String titulo;
	private String autor;
	private String editora;
	private String anoPublicacao;
	private String genero;
	private String sinopse;
	private String imagem;
	
	//Construtor
	public Multimidia(String titulo, String autor, String editora, String anoPublicacao, String genero, String sinopse, String imagem) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao; 
		this.genero = genero;
		this.sinopse = sinopse;
		this.imagem = imagem;
	}
	
    //Getters e Setters para acessar os atributos privados
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    //Método
    public void determinarEmprestimo(){
        System.out.println("O item multimidia foi emprestado!");
    }
}
