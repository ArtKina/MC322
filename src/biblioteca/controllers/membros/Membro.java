package biblioteca.controllers.membros;

import biblioteca.controllers.emprestimos.Emprestimo;
import biblioteca.controllers.membros.Funcionario;
import java.util.List;
import java.util.ArrayList;

public class Membro {
    private String nome;
    private int nIdentificacao;
    private String endereco;
    private int contato;
    private String dataRegistro;
    private Emprestimo[] emprestimos;
    private int numEmprestimos;
    private int maxEmprestimos;
    private List<Emprestimo> historicoEmprestimos;

    // Construtor
    public Membro(String nome, int nIdentificacao, String endereco, int contato, String dataRegistro, int maxEmprestimos) {
        this.nome = nome;
        this.nIdentificacao = nIdentificacao;
        this.endereco = endereco;
        this.contato = contato;
        this.dataRegistro = dataRegistro;
        this.maxEmprestimos = maxEmprestimos;
        this.emprestimos = new Emprestimo[maxEmprestimos];
        numEmprestimos = 0;
        this.historicoEmprestimos = new ArrayList<>();
    }

    public class ExcecaoLimiteEmprestimoExcedido extends Exception { 
        public ExcecaoLimiteEmprestimoExcedido(String errorMessage) {
            super(errorMessage);
        }
    }

    // Getters para acessar os atributos privados
    public int getId() {
        return nIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMax() {
        return maxEmprestimos;
    }

    public void addEmprestimo(Emprestimo emprestimo) throws
    ExcecaoLimiteEmprestimoExcedido {
        if (numEmprestimos > maxEmprestimos) {
            throw new ExcecaoLimiteEmprestimoExcedido("Limite máximo de itens emprestado excedido!");
        }
        emprestimos[numEmprestimos] = emprestimo;
        numEmprestimos++;
        System.out.println("item adicionado!");
    }

    // Método de histórico
    public void adicionarHistoricoEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado no histórico de " + nome);
    }

}
