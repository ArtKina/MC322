package biblioteca.controllers;

import biblioteca.controllers.membros.*;
import biblioteca.controllers.emprestimos.*;
import biblioteca.controllers.Item;
import biblioteca.controllers.EventosBiblioteca;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Biblioteca {
  private List<Membro> membros;
  private Map<Integer, Item> itens;
  private Set<Emprestimo> emprestimos;
  private List<ReservaSala> reservas;
  private Set<Categoria> categorias;
  private List<EventosBiblioteca> eventos;
  private Map<String, Set<Membro>> participantesPorEvento;


  public Biblioteca(List<Membro> membros) {
    this.membros = membros;
    this.itens = new HashMap<>();
    this.emprestimos = new HashSet<>();
    this.reservas = new ArrayList<>();
    this.categorias = new HashSet<>();
    this.eventos = new ArrayList<>();
    this.participantesPorEvento = new HashMap<>();
  }

  //Métodos - Membros
  public void addMembro(Membro membro) {
    membros.add(membro);
    System.out.println(membro.getNome() + " é um novo membro da biblioteca");
  }

  public void removeMembro(Membro membro) {
    membros.remove(membro);
    System.out.println(membro.getNome() + " não é mais um membro da biblioteca");
  }

  //Métodos - Itens
  public void addItem(Item item) {
    itens.put(item.getId(), item);
    System.out.println("Item com ID " + item.getId() + " foi adicionado à biblioteca");
}

public void removeItem(int itemId) {
    if (itens.containsKey(itemId)) {
        Item item = itens.get(itemId);
        itens.remove(itemId);
        System.out.println("Item com ID " + itemId + " foi removido da biblioteca");
    } else {
        System.out.println("Item com ID " + itemId + " não foi encontrado na biblioteca");
    }
}

//Métodos - Empréstimo
public void realizarEmprestimo(String dataEmprestimo, String dataDevolucao, int diasEmprestado, int diasAtraso, Membro membro) {
  Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, diasEmprestado, diasAtraso, membro);
  
  if (emprestimos.contains(emprestimo)) {
      System.out.println("Este item já foi emprestado e não pode ser emprestado novamente neste momento.");
  } else {
      emprestimos.add(emprestimo);
      System.out.println("Empréstimo realizado com sucesso!");
  }
}

public void realizarDevolucao(String dataEmprestimo, String dataDevolucao, int diasEmprestado, int diasAtraso, Membro membro) {
  Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, diasEmprestado, diasAtraso, membro);
  
  if (emprestimos.contains(emprestimo)) {
      emprestimos.remove(emprestimo);
      System.out.println("Devolução realizada com sucesso!");
  } else {
      System.out.println("Não foi possível encontrar este empréstimo para realizar a devolução.");
  }
}

//Métodos - Reserva
public void realizarReserva(String dataReserva, String horaInicio, String horaFim) {
  ReservaSala reserva = new ReservaSala(dataReserva, horaInicio, horaFim);
  reservas.add(reserva);
  System.out.println("Reserva realizada com sucesso!");
}

public void cancelarReserva(String dataReserva, String horaInicio, String horaFim) {
  ReservaSala reserva = new ReservaSala(dataReserva, horaInicio, horaFim);
  if (reservas.contains(reserva)) {
      reservas.remove(reserva);
      System.out.println("Reserva cancelada com sucesso!");
  } else {
      System.out.println("Não foi possível encontrar esta reserva para cancelar.");
  }
}

//Método - Categoria
public void adicionarCategoria(Categoria categoria) {
  categorias.add(categoria);
  System.out.println("Categoria '" + categoria.getNome() + "' adicionada à biblioteca.");
}

//Métodos - Evento
public void adicionarParticipante(String nomeEvento, Membro membro) {
  if (participantesPorEvento.containsKey(nomeEvento)) {
      Set<Membro> participantes = participantesPorEvento.get(nomeEvento);
      participantes.add(membro);
      System.out.println(membro.getNome() + " está participando do evento '" + nomeEvento + "'.");
  } else {
      System.out.println("Evento '" + nomeEvento + "' não encontrado.");
  }
}

public void removerParticipante(String nomeEvento, Membro membro) {
  if (participantesPorEvento.containsKey(nomeEvento)) {
      Set<Membro> participantes = participantesPorEvento.get(nomeEvento);
      if (participantes.contains(membro)) {
          participantes.remove(membro);
          System.out.println(membro.getNome() + " não está mais participando do evento '" + nomeEvento + "'.");
      } else {
          System.out.println(membro.getNome() + " não estava na lista de participantes do evento '" + nomeEvento + "'.");
      }
  } else {
      System.out.println("Evento '" + nomeEvento + "' não encontrado.");
  }
}



}
