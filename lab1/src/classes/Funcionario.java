package classes;

public class Funcionario{
    // Atributos da classe
	private String id;
	private String nome;
	private String funcao;

    //Construtor
    public Funcionario(String id, String nome, String funcao) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
    }
    
    //Getters para acessar os atributos privados
    public String getId() {
    	return id;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public String getFuncao() {
    	return funcao;
    }
    
}
