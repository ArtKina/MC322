package main;

import biblioteca.controllers.emprestimos.Emprestimo;
import biblioteca.controllers.membros.Membro;
import biblioteca.controllers.itens.multimidias.*;

import java.util.ArrayList;

import biblioteca.controllers.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Membro> membros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(membros, null, null, null, null, null, null);

        Membro Kina = new Membro("Arthur Kina", 1, "Jundiai", 994221485, "17/09/2023", 10);
        Membro George = new Membro("George Sá", 2, "Jundiai", 994221485, "17/09/2023", 10);
        Membro Arthur = new Membro("Arthur Kina", 1, "Jundiai", 994221485, "17/09/2023", 10);

        biblioteca.addMembro(Kina);
        biblioteca.addMembro(George);
        biblioteca.addMembro(Arthur);
        biblioteca.removeMembro(Arthur);

        // Criação de objetos para testar Emprestimo
        List<Multimidia> itensEmprestados = new ArrayList<>();
        Emprestimo emprestimo = new Emprestimo(itensEmprestados, "2023-10-01", "2023-10-15", 15, 0, Kina);

        // Criando itens de multimídia
        Multimidia item1 = Multimidia.getInstance("Dom Quixote", "Miguel de Cervantes", "Moderna", 2023, "Ficção", "Texto",
        "Imagem", 123);
        Multimidia item2 = Multimidia.getInstance("Revolução dos bichos", "George Owell", "Moderna", 2023, "Ficção", "Texto",
        "Imagem", 1234);

        //Como só pode criar uma instância os dois itens devem ser iguais
        System.out.println(item1.getTitulo());
        System.out.println(item2.getTitulo());
        
        try {
            // Tentando adicionar o mesmo item duas vezes (deve lançar uma exceção)
            emprestimo.addItemEmprestado(item1);
            emprestimo.addItemEmprestado(item1);
        } catch (Emprestimo.ExcecaoItemNaoDisponivel e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // Adicionando um item diferente
        try {
            emprestimo.addItemEmprestado(item2);
        } catch (Emprestimo.ExcecaoItemNaoDisponivel e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

    }
}