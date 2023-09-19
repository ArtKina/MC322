package biblioteca.controllers;

public class ItemBiblioteca<T> {
    private T item;
    private String titulo;
    private int id;
    private String status;

    //Construtor
    public Item(T item, String titulo, int id, String status){
        this.item = item;
        this.titulo = titulo;
        this.id = id;
        this.status = status;
    }

    public int getId(){
        return id;
    }

     // Método para emprestar o item
    public void emprestar() {
        if ("Disponível".equals(status)) {
            status = "Emprestado";
            System.out.println("Item emprestado com sucesso!");
        } else {
            System.out.println("O item não está disponível para empréstimo.");
        }
    }

    // Método para devolver o item
    public void devolver() {
        if ("Emprestado".equals(status)) {
            status = "Disponível";
            System.out.println("Item devolvido com sucesso!");
        } else {
            System.out.println("O item não pode ser devolvido no momento.");
        }
    }

    // Método para reservar o item
    public void reservar() {
        if ("Disponível".equals(status)) {
            status = "Reservado";
            System.out.println("Item reservado com sucesso!");
        } else {
            System.out.println("O item não está disponível para reserva.");
        }
    }

    public String getStatus() {
        return status;
    }

}
