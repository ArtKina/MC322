package biblioteca.controllers.membros;

import java.util.List;

import biblioteca.controllers.emprestimos.Emprestimo;

public class Funcionario extends Membro{
    private String nome;
    private int nIdentificacao;
    private String endereco;
    private int contato;
    private String dataRegistro;
    private int numEmprestimos;

    //Construtor
    public Funcionario(String nome, int nIdentificacao, String endereco, int contato, String dataRegistro, int numEmprestimos ) {
        super(nome, nIdentificacao, endereco, contato, dataRegistro, numEmprestimos);
    }
}