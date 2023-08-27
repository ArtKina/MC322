package classes.membros;

import classes.emprestimos.Emprestimo;

public class Membro {
    private String id;
    private String nome;
    private Emprestimo[] emprestimos;
    private int numEmprestimos;
    
    //Construtor
    public Membro(String id, String nome, int maxEmprestimos) {
        this.id = id;
        this.nome = nome;
        emprestimos = new Emprestimo[maxEmprestimos];
        numEmprestimos = 0;
    }

    //Getters para acessar os atributos privados
    public String getId() {
    	return id;
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
