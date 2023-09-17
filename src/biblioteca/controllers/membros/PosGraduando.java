package biblioteca.controllers.membros;

import classes.emprestimos.Emprestimo;

public class PosGraduando extends Membro{
    //Construtor
    public PosGraduando(String nome, int nIdentificacao, String endereco, int contato, String dataRegistro, int numEmprestimos ) {
        super(nome, nIdentificacao, endereco, contato, dataRegistro, numEmprestimos);
    }
}
