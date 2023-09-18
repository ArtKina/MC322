package biblioteca.controllers;

import biblioteca.controllers.membros.*;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
  private List<Membro> membros;

  public Biblioteca(List<Membro> membros) {
    this.membros = membros;
  }

  //Métodos
  public void addMembro(Membro membro) {
    membros.add(membro);
    System.out.println(membro.getNome() + " é um novo membro da biblioteca");
  }

  public void removeMembro(Membro membro) {
    membros.remove(membro);
    System.out.println(membro.getNome() + " não é mais um membro da biblioteca");
  }

}
