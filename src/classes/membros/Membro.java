package classes.membros;

import classes.emprestimos.Emprestimo;

public class Membro {
    private String nome;
    private int nIdentificacao;
    private String endereco;
    private int contato;
    private String dataRegistro;
    private Emprestimo[] emprestimos;
    private int numEmprestimos;
    
    //Construtor
    public Membro(String nome, int nIdentificacao, String endereco, int contato, String dataRegistro, int maxEmprestimos) {
        this.nome = nome;
        this.nIdentificacao = nIdentificacao;
        this.endereco = endereco;
        this.contato = contato;
        this.dataRegistro = dataRegistro;
        emprestimos = new Emprestimo[maxEmprestimos];
        numEmprestimos = 0;
    }

    //Getters para acessar os atributos privados
    public int getId() {
    	return nIdentificacao;
    }

    public String getNome() {
    	return nome;
    }
    
    public void addEmprestimo(Emprestimo emprestimo) {
    	if (numEmprestimos < emprestimos.length) {
    		emprestimos[numEmprestimos] = emprestimo;
    		numEmprestimos++;
    	} else {
    		System.out.println("Você atingiu o número máximo de empréstimos");
    	}
    }

}