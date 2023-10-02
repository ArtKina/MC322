package biblioteca.controllers.emprestimos;

import biblioteca.controllers.membros.Membro;
import biblioteca.controllers.itens.multimidias.Multimidia;

import java.util.List;
import java.util.ArrayList;

public class Emprestimo {
    // Atributos da classe
    private List<Multimidia> itensEmprestados;
    private String dataEmprestimo;
    private String dataDevolucao;
    private int diasEmprestado;
    private int diasAtraso;
    private Membro emprestador;
    private int numItens;

    //Construtor
    public Emprestimo(List<Multimidia> itensEmprestados, String dataEmprestimo, String dataDevolucao, int diasEmprestado, int diasAtraso, Membro emprestador) {
    	this.itensEmprestados = itensEmprestados;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.diasEmprestado = diasEmprestado;
        this.diasAtraso = diasAtraso;
        this.emprestador = emprestador;
    }

    public class ExcecaoItemNaoDisponivel extends Exception { 
        public ExcecaoItemNaoDisponivel(String errorMessage) {
            super(errorMessage);
        }
    }

    //Getters e setters para acessar os atributos privados
    public List<Multimidia> getitensEmprestados() {
    	return itensEmprestados;
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
    
    public int getNumItens() {
    	return numItens;
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
    
    //Métodos
    public void addItemEmprestado(Multimidia item) throws
    ExcecaoItemNaoDisponivel {
        if (itensEmprestados.contains(item)) {
            throw new ExcecaoItemNaoDisponivel("Item não Disponível!");
        }
        itensEmprestados.add(item);
        System.out.println("item adicionado!");
    }
}