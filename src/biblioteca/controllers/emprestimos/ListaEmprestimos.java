package biblioteca.controllers.emprestimos;

import biblioteca.controllers.membros.Membro;
import biblioteca.controllers.multimidias.Multimidia;

public class ListaEmprestimos<T> {
    // Atributos da classe
    private T membro;
    private Multimidia[] listaItens;
    private String dataEmprestimo;
    private String dataDevolucao;

    //Construtor
    public ListaEmprestimos(T membro, String dataEmprestimo, String dataDevolucao) {
    	listaItens = new Multimidia[1];
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    //Getters e setters para acessar os atributos privados
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
    
    //Métodos
    public void addItemEmprestado(Multimidia item) {
		listaItens[numItens] = item;
		numItens++;
    }

    //Add mais métodos
}
