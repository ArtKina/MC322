package app;

public class Emprestimo{
    // Atributos da classe
    Livro livroEmprestado;
    String dataEmprestimo;
    String dataDevolucao;
    int diasEmprestado;
    int diasAtraso;
    Membro emprestador;

    //Construtor
    public Emprestimo(Livro livroEmprestado, String dataEmprestimo, String dataDevolucao, int diasEmprestado, int diasAtraso, Membro emprestador) {
        this.livroEmprestado = livroEmprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.diasEmprestado = diasEmprestado;
        this.diasAtraso = diasAtraso;
        this.emprestador = emprestador;
    }
}
