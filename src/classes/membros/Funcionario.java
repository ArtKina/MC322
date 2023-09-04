package classes.membros;

public class Funcionario extends Membro{
    //Construtor
    public Funcionario(String nome, int nIdentificacao, String endereco, int contato, String dataRegistro, int numEmprestimos ) {
        super(nome, nIdentificacao, endereco, contato, dataRegistro, numEmprestimos);
    }
}