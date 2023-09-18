package biblioteca.controllers;

public class Categoria {
    String nome;

    //Construtor
    public Categoria(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
