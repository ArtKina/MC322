package biblioteca.controllers.membros;

import java.util.ArrayList;
import java.util.List;

// Interface Observer
interface Observer {
    void update();
}

// Classe Subject
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    // Função de registro do observador
    public void registraObserver(Observer observer) {
        observers.add(observer);
    }

    // Função para notificar o observador
    public void notificaObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}