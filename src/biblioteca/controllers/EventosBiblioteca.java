package biblioteca.controllers;

public class EventosBiblioteca {
    private static String nomeEvento;

    public EventosBiblioteca(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public static String getNomeEvento() {
        return nomeEvento;
    }

    public static void setNomeEvento(String nomeEvento) {
        EventosBiblioteca.nomeEvento = nomeEvento;
    }

    //Classe Interna Palestra
    public class Palestra {
        public String palestrante;
        public String topico;
        public String data;
        public String horario;
        public String local;

        public Palestra(String palestrante, String topico, String data, String horario, String local) {
            this.palestrante = palestrante;
            this.topico = topico;
            this.data = data;
            this.horario = horario;
            this.local = local;
        }

        public String getPalestrante() {
            return palestrante;
        }

        public void setPalestrante(String palestrante) {
            this.palestrante = palestrante;
        }

        public String getTopico() {
            return topico;
        }

        public void setTopico(String topico) {
            this.topico = topico;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getHorario() {
            return horario;
        }

        public void setHorario(String horario) {
            this.horario = horario;
        }

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }
    }

    //Classe Interna Workshop
    public class Workshop {
        public String instrutor;
        public String topico;
        public String materiaisNecessarios;
        public String data;
        public String horario;
        public String local;

        public Workshop(String instrutor, String topico, String materiaisNecessarios, String data, String horario, String local) {
            this.instrutor = instrutor;
            this.topico = topico;
            this.materiaisNecessarios = materiaisNecessarios;
            this.data = data;
            this.horario = horario;
            this.local = local;
        }

        public String getInstrutor() {
            return instrutor;
        }

        public void setInstrutor(String instrutor) {
            this.instrutor = instrutor;
        }

        public String getTopico() {
            return topico;
        }

        public void setTopico(String topico) {
            this.topico = topico;
        }

        public String getMateriaisNecessarios() {
            return materiaisNecessarios;
        }

        public void setMateriaisNecessarios(String materiaisNecessarios) {
            this.materiaisNecessarios = materiaisNecessarios;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getHorario() {
            return horario;
        }

        public void setHorario(String horario) {
            this.horario = horario;
        }

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }
    }

    //Classe Interna Exposicao
    public class Exposicao {
        public String tema;
        public String expositores;
        public String duracao;
        public String local;

        public Exposicao(String tema, String expositores, String duracao, String local) {
            this.tema = tema;
            this.expositores = expositores;
            this.duracao = duracao;
            this.local = local;
        }

        public String getTema() {
            return tema;
        }

        public void setTema(String tema) {
            this.tema = tema;
        }

        public String getExpositores() {
            return expositores;
        }

        public void setExpositores(String expositores) {
            this.expositores = expositores;
        }

        public String getDuracao() {
            return duracao;
        }

        public void setDuracao(String duracao) {
            this.duracao = duracao;
        }

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }
    }

    // Enum: TipoDeEvento
    public enum TipoDeEvento {
        PALESTRA, WORKSHOP, EXPOSIÇÃO
    }
}
