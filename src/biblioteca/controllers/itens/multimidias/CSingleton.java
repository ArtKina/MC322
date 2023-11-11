package biblioteca.controllers.itens.multimidias;

public class CSingleton {
    private static CSingleton instance;

    private CSingleton() {
        // Construtor privado para evitar instanciação direta
    }

    public static CSingleton getInstance() {
        if (instance == null) {
            instance = new CSingleton();
        }
        return instance;
    }
}
