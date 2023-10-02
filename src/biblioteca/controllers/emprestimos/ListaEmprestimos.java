package biblioteca.controllers.emprestimos;

import biblioteca.controllers.membros.Membro;
import biblioteca.controllers.itens.multimidias.Multimidia;
import java.util.List;
import java.util.ArrayList;

public class ListaEmprestimos<T> {
    // Atributos da classe
    private T membro;
    private List<Multimidia> listaItens;
    private String dataEmprestimo;
    private String dataDevolucao;
    private int numItens;

    // Construtor
    public ListaEmprestimos(T membro, String dataEmprestimo, String dataDevolucao, List<Multimidia> listaItens) {
        this.listaItens = listaItens;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        numItens = listaItens.size();
    }

    // Getters e setters para acessar os atributos privados
    public List<Multimidia> getlistaItens() {
        return listaItens;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public Integer getNumItens() {
        return numItens;
    }

    public void setDataEmprestimo(String novaDataEmprestimo) {
        dataEmprestimo = novaDataEmprestimo;
    }

    public void setDataDevolucao(String novaDataDevolucao) {
        dataDevolucao = novaDataDevolucao;
    }

    // Métodos
    public void addItemEmprestado(Multimidia item) {
        listaItens.add(item);
        numItens++;
    }
}
