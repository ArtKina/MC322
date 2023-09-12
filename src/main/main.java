package main;
import biblioteca.controllers.emprestimos.*;
import biblioteca.controllers.membros.*;
import biblioteca.controllers.multimidias.*;

public class main {
    public static void main(String[] args) {
        LivroFisico livro = new LivroFisico("Dom Quixote", "Miguel De Cervantes", "Francisco de Robles", 1605, "Aventura", "A história relata os feitos de um ingênuo e fidalgo cavaleiro medieval", null, "9788408061052", 1, 3, 1, "1a estante", "baixa");
        String titulo = livro.getTitulo();
        System.out.println(titulo);
    }
}