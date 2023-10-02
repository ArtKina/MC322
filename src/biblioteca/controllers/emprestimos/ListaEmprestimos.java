package biblioteca.controllers.emprestimos;

import biblioteca.controllers.membros.Membro;
import biblioteca.controllers.multimidias.Multimidia;

public class ListaEmprestimos<T> {
    // Atributos da classe
    private T membro;
    private Multimidia[] listaItens;
    private String dataEmprestimo;
    private String dataDevolucao;

    // Construtor
    public ListaEmprestimos(T membro, String dataEmprestimo, String dataDevolucao) {
        listaItens = new Multimidia[1];
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e setters para acessar os atributos privados
    public Multimidia[] getlistaItens() {
        return listaItens;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataEmprestimo(String novaDataEmprestimo) {
        dataEmprestimo = novaDataEmprestimo;
    }

    public void setDataDevolucao(String novaDataDevolucao) {
        dataDevolucao = novaDataDevolucao;
    }

    // Métodos
    public void addItemEmprestado(Multimidia item) {
        listaItens[numItens] = item;
        numItens++;
    }

    public class LimiteEmprestimoExcedidoException extends Exception {
        public LimiteEmprestimoExcedidoException(String mensagem) {
            super(mensagem);
        }
    }

    public class ItemNaoDisponivelException extends Exception {
        public ItemNaoDisponivelException(String mensagem) {
            super(mensagem);
        }
    }

    public class MembroComMultasException extends Exception {
        public MembroComMultasException(String mensagem) {
            super(mensagem);
        }
    }

    try

    {
        // Limite de empréstimo
        if (listaItens.size() >= limiteEmprestimo) {
            throw new LimiteEmprestimoExcedidoException("Limite de empréstimo excedido.");
        }

        // Disponibilidade para empréstimo
        if (!item.isDisponivel()) {
            throw new ItemNaoDisponivelException("O item não está disponível para empréstimo.");
        }

        // Multas pendentes
        if (membro.temMultasPendentes()) {
            throw new MembroComMultasException("Membro com multas pendentes não pode realizar empréstimos.");
        }

        // Realiza o empréstimo
        listaItens.add(item);
    }catch(LimiteEmprestimoExcedidoException|ItemNaoDisponivelException|
    MembroComMultasException e)
    {
        // Exceções personalizadas foram capturadas, forneça uma mensagem informativa ao
        // usuário
        System.out.println("Erro: " + e.getMessage());
        // Aqui você pode tomar medidas adicionais, como permitir ao usuário corrigir a
        // ação
    }catch(
    Exception e)
    {
        // Outras exceções não esperadas podem ser tratadas aqui
        System.out.println("Erro inesperado: " + e.getMessage());
        // Considere lançar a exceção para um nível superior no sistema, se necessário
    }

}
