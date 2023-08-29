package classes.multimidias;

public class Multimidia {
	private String titulo;
	private String autor;
	private String editora;
	private String situacao;
	private String id;
	private CD[] cds; //Agregação com a classe CD
	private DVD[] dvds; //Agregação com a classe DVD
	private LivroEletronico[] livrosEletronicos; //Agregação com a classe LivroEletronico
	private LivroFisico[] livrosFisicos; //Agregação com a classe LivroFisico
	
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
