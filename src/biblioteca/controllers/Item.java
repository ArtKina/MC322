package biblioteca.controllers;

import java.util.List;
import java.util.ArrayList;

public class Item {
    private int id;
    private String texto;
    private List<Comentario> comentarios;

    //Construtor
    public Item(int id, String texto){
        this.id = id;
        this.texto = texto;
        this.comentarios = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
        System.out.println("Comentário adicionado com sucesso ao item '" + id + "'.");
    }

    public void listarComentarios() {
        System.out.println("Comentários para o item '" + id + "':");
        for (Comentario comentario : comentarios) {
            System.out.println("Comentário: " + comentario.getTexto());
            System.out.println("------");
        }
    }

}
