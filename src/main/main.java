
import biblioteca.controllers.emprestimos.*;
import biblioteca.controllers.membros.*;
import biblioteca.controllers.multimidias.*;

import java.util.ArrayList;

import biblioteca.controllers.*;
import biblioteca.controllers.membros.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Membro> membros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(membros);

        Membro Kina = new Membro("Arthur Kina", 1, "Jundiai", 994221485,"17/09/2023", 10);
        Membro George = new Membro("George Sá", 2, "Jundiai", 994221485,"17/09/2023", 10);
        Membro Arthur = new Membro("Arthur Kina", 1, "Jundiai", 994221485,"17/09/2023", 10);

        biblioteca.addMembro(Kina);
        biblioteca.addMembro(George);
        biblioteca.addMembro(Arthur);
        biblioteca.removeMembro(Arthur);

        LivroFisico livro = new LivroFisico("Dom Quixote", "Miguel De Cervantes", "Francisco de Robles", 1605, "Aventura", "A história relata os feitos de um ingênuo e fidalgo cavaleiro medieval", null, "9788408061052", 1, 3, 1, "1a estante", "baixa");
        String titulo = livro.getTitulo();
        System.out.println(titulo);

        //Implementação das classes internas e do ENUM para a classe Equipamentos

        Equipamentos equipamentosBiblioteca = new Equipamentos("Equipamento para o evento clube da leitura");

        Equipamentos.Informatica computador = equipamentosBiblioteca.new Informatica("Computador", "Dell", "Optiplex 3050");
        Equipamentos.Audiovisual camera = equipamentosBiblioteca.new Audiovisual("Câmera", "Sony", "Alpha 6400");
        Equipamentos.Impressao impressora = equipamentosBiblioteca.new Impressao("Impressora", "HP", "LaserJet Pro MFP M130nw");

        System.out.println("Detalhes do Equipamento de Informática:");
        System.out.println("Tipo: " + computador.tipo);
        System.out.println("Marca: " + computador.marca);
        System.out.println("Modelo: " + computador.modelo);
        System.out.println("Categoria: " + Equipamentos.CategoriaEquipamento.INFORMATICA);
        System.out.println();

        System.out.println("Detalhes do Equipamento Audiovisual:");
        System.out.println("Tipo: " + camera.tipo);
        System.out.println("Marca: " + camera.marca);
        System.out.println("Modelo: " + camera.modelo);
        System.out.println("Categoria: " + Equipamentos.CategoriaEquipamento.AUDIOVISUAL);
        System.out.println();

        System.out.println("Detalhes do Equipamento de Impressão:");
        System.out.println("Tipo: " + impressora.tipo);
        System.out.println("Marca: " + impressora.marca);
        System.out.println("Modelo: " + impressora.modelo);
        System.out.println("Categoria: " + Equipamentos.CategoriaEquipamento.IMPRESSÃO);

    }
}