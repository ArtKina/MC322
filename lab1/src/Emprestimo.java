public class Emprestimo{
    // Atributos da classe
	private Livro livroEmprestado;
    private String dataEmprestimo;
    private String dataDevolucao;
    private int diasEmprestado;
    private int diasAtraso;
    private Membro emprestador;
    
    //Construtor
    public Emprestimo(Livro livroEmprestado, String dataEmprestimo, String dataDevolucao,  int diasEmprestado, int diasAtraso, Membro emprestador) {
    	this.livroEmprestado = livroEmprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.diasEmprestado = diasEmprestado;
        this.diasAtraso = diasAtraso;
        this.emprestador = emprestador;
    }
}