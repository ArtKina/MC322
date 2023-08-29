package classes.membros;

import classes.emprestimos.Emprestimo;

public class Membro {
    private String id;
    private String nome;
    private String endereco;
    private String contato;
    private String dataRegistro; 
    private Emprestimo[] emprestimos;//relação de associacao entre membro e emprestimo
    private Funcionario[] funcionarios; //Agregação com a classe Funcionario
    private Graduando[] graduandos; //Agregação com a classe Graduando
    private PosGraduando[] posGraduandos; //Agregação com a classe PosGraduando
    private Professor[] professors; //Agregação com a classe Professor
    private int numEmprestimos;
    
    //Construtor
    public Membro(String id, String nome, int maxEmprestimos) {
        this.id = id;
        this.nome = nome;
        emprestimos = new Emprestimo[maxEmprestimos];
        numEmprestimos = 0;
    }
    // Construtor para Funcionário
    public Membro(String id, String nome, int maxEmprestimos, Funcionario[] funcionarios) {
        this(id, nome, maxEmprestimos);
        this.funcionarios = funcionarios;
    }

    // Construtor para Graduando
    public Membro(String id, String nome, int maxEmprestimos, Graduando[] graduandos) {
        this(id, nome, maxEmprestimos);
        this.graduandos = graduandos;
    }

    // Construtor para Pós-Graduando
    public Membro(String id, String nome, int maxEmprestimos, PosGraduando[] posGraduandos) {
        this(id, nome, maxEmprestimos);
        this.posGraduandos = posGraduandos;
    }

    // Construtor para Professor
    public Membro(String id, String nome, int maxEmprestimos, Professor[] professors) {
        this(id, nome, maxEmprestimos);
        this.professors = professors;
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

    // Getter e Setter para Funcionarios
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    // Getter e Setter para Graduandos
    public Graduando[] getGraduandos() {
        return graduandos;
    }

    public void setGraduandos(Graduando[] graduandos) {
        this.graduandos = graduandos;
    }

    // Getter e Setter para PosGraduandos
    public PosGraduando[] getPosGraduandos() {
        return posGraduandos;
    }

    public void setPosGraduandos(PosGraduando[] posGraduandos) {
        this.posGraduandos = posGraduandos;
    }

    // Getter e Setter para Professors
    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }

}
