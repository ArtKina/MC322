package classes;

public class Emprestimo{
    // Atributos da classe
	private Livro livroEmprestado;
	private String dataEmprestimo;
	private String dataDevolucao;
	private int diasEmprestado;
	private int diasAtraso;
	private Membro emprestador;

    //Construtor
    public Emprestimo(Livro livroEmprestado, String dataEmprestimo, String dataDevolucao, int diasEmprestado, int diasAtraso, Membro emprestador) {
        this.livroEmprestado = livroEmprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.diasEmprestado = diasEmprestado;
        this.diasAtraso = diasAtraso;
        this.emprestador = emprestador;
    }

    //Getters para acessar os atributos privados
    public Livro getLivroEmprestado() {
    	return livroEmprestado;
    }

    public String getDataEmprestimo() {
    	return dataEmprestimo;
    }

    public String getDataDevolucao() {
    	return dataDevolucao;
    }

    public int getDiasEmprestado() {
    	return diasEmprestado;
    }

    public int getDiasAtraso() {
    	return diasAtraso;
    }

    public Membro getEmprestador() {
    	return emprestador;
    }
    
    public void setDataEmprestimo(String novaDataEmprestimo) {
    	dataEmprestimo = novaDataEmprestimo;
    }
    
    public void setDataDevolucao(String novaDataDevolucao) {
    	dataDevolucao = novaDataDevolucao;
    }
    
    public void setDiasEmprestado(int novoDiasEmprestado) {
    	diasEmprestado = novoDiasEmprestado;
    }
    
    public void setDiasAtrasado(int novoDiasAtraso) {
    	diasAtraso = novoDiasAtraso;
    }
    
    public void setNovoEmprestador(Membro novoEmprestador) {
    	emprestador = novoEmprestador;
    }
}