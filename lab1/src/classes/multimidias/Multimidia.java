package classes.multimidias;

public class Multimidia {
	private String titulo;
	private String autor;
	private String situacao;
	private String id;
	
	//Construtor
	public Multimidia(String titulo, String autor, String situacao, String id) {
		this.titulo = titulo;
		this.autor = autor;
		this.situacao = situacao;
		this.id = id;
	}
	
    //Getters e Setters para acessar os atributos privados
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getId() {
    	return id;
    }
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String novaSituacao) {
        situacao = novaSituacao;
    }
    
    //Método
    public void determinarEmprestimo(){
        System.out.println("O item multimidia foi emprestado!");
    }
}
