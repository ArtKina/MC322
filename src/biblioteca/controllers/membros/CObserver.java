package biblioteca.controllers.membros;

// Classe ConcreteObserver
public class CObserver implements Observer {
    private String nome;

    public CObserver(String nome) {
        this.nome = nome;
    }

    // Função para notificar o observador
    @Override
    public void update() {
        System.out.println("Observer " + nome + " seu item está disponível!");
    }
}
