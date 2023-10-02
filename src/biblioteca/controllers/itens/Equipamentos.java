package biblioteca.controllers.itens;

public class Equipamentos {
    private static String nomeEquipamentos;

    public Equipamentos(String nomeEquipamentos) {
        this.nomeEquipamentos = nomeEquipamentos;
    }

    // Getter e Setter para nomeEquipamentos
    public static String getNomeEquipamentos() {
        return nomeEquipamentos;
    }

    public static void setNomeEquipamentos(String nomeEquipamentos) {
        Equipamentos.nomeEquipamentos = nomeEquipamentos;
    }

    // Classe Interna Informatica
    public class Informatica {
        public String tipo;
        public String marca;
        public String modelo;

        public Informatica(String tipo, String marca, String modelo) {
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        // Getters e Setters para Informatica
        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

    //Classe Interna Audiovisual
    public class Audiovisual {
        public String tipo;
        public String marca;
        public String modelo;

        public Audiovisual(String tipo, String marca, String modelo) {
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        // Getters e Setters para Audiovisual
        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

    //Classe Interna Impressao
    public class Impressao {
        public String tipo;
        public String marca;
        public String modelo;

        public Impressao(String tipo, String marca, String modelo) {
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        // Getters e Setters para Impressao
        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

    // Enum: CategoriaEquipamento
    public enum CategoriaEquipamento {
        INFORMATICA, AUDIOVISUAL, IMPRESSÃO
    }
}
