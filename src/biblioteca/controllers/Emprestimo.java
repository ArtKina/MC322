package biblioteca.controllers;

import classes.membros.Membro;
import classes.multimidias.Multimidia;

public class Emprestimo {
    // Atributos da classe
    private Multimidia[] itensEmprestados;
    private String dataEmprestimo;
    private String dataDevolucao;
    private int diasEmprestado;
    private int diasAtraso;
    private Membro emprestador;
    private int numItens;

    //Construtor
    public Emprestimo(String dataEmprestimo, String dataDevolucao, int diasEmprestado, int diasAtraso, Membro emprestador) {
    	itensEmprestados = new Multimidia[1];
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.diasEmprestado = diasEmprestado;
        this.diasAtraso = diasAtraso;
        this.emprestador = emprestador;
    }

    //Getters e setters para acessar os atributos privados
    public Multimidia[] getitensEmprestados() {
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
    public void addItemEmprestado(Multimidia item) {
		itensEmprestados[numItens] = item;
		numItens++;
    }
}
