package classes.Membro;

public class PosGraduando {
    // Atributos da classe
    private String id;
    private String nome;

    //Construtor
    public PosGraduando(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //Getters para acessar os atributos privados
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
