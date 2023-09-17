package biblioteca.controllers;

public class ReservaSala {
    private static String dataReserva;
    private static String horaInicio;
    private static String horaFim;
    private static StatusReserva status;

    public ReservaSala(String dataReserva, String horaInicio, String horaFim) {
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = StatusReserva.PENDENTE;
    }

    public void confirmarReserva() {
        this.status = StatusReserva.CONFIRMADA;
    }

    public void cancelarReserva() {
        this.status = StatusReserva.CANCELADA;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    // Classe Interna SalaIndividual
    public class SalaIndividual {
        public boolean computadorDisponivel;
        public int numeroSala;

        public SalaIndividual(boolean computadorDisponivel, int numeroSala) {
            this.computadorDisponivel = computadorDisponivel;
            this.numeroSala = numeroSala;
        }

        public boolean isComputadorDisponivel() {
            return computadorDisponivel;
        }

        public void setComputadorDisponivel(boolean computadorDisponivel) {
            this.computadorDisponivel = computadorDisponivel;
        }

        public int getNumeroSala() {
            return numeroSala;
        }

        public void setNumeroSala(int numeroSala) {
            this.numeroSala = numeroSala;
        }
    }

    // Classe Interna SalaGrupo
    public class SalaGrupo {
        public int capacidadeMaxima;
        public boolean equipamentoApresentacao;

        public SalaGrupo(int capacidadeMaxima, boolean equipamentoApresentacao) {
            this.capacidadeMaxima = capacidadeMaxima;
            this.equipamentoApresentacao = equipamentoApresentacao;
        }

        public int getCapacidadeMaxima() {
            return capacidadeMaxima;
        }

        public void setCapacidadeMaxima(int capacidadeMaxima) {
            this.capacidadeMaxima = capacidadeMaxima;
        }

        public boolean isEquipamentoApresentacao() {
            return equipamentoApresentacao;
        }

        public void setEquipamentoApresentacao(boolean equipamentoApresentacao) {
            this.equipamentoApresentacao = equipamentoApresentacao;
        }
    }

    // Classe Interna SalaSilenciosa
    public class SalaSilenciosa {
        public int numeroAssentos;
        public boolean cabinesIndividuais;

        public SalaSilenciosa(int numeroAssentos, boolean cabinesIndividuais) {
            this.numeroAssentos = numeroAssentos;
            this.cabinesIndividuais = cabinesIndividuais;
        }

        public int getNumeroAssentos() {
            return numeroAssentos;
        }

        public void setNumeroAssentos(int numeroAssentos) {
            this.numeroAssentos = numeroAssentos;
        }

        public boolean isCabinesIndividuais() {
            return cabinesIndividuais;
        }

        public void setCabinesIndividuais(boolean cabinesIndividuais) {
            this.cabinesIndividuais = cabinesIndividuais;
        }
    }

    // Classe Interna SalaMultimidia
    public class SalaMultimidia {
        public boolean equipamentosMultimidia;

        public SalaMultimidia(boolean equipamentosMultimidia) {
            this.equipamentosMultimidia = equipamentosMultimidia;
        }

        public boolean isEquipamentosMultimidia() {
            return equipamentosMultimidia;
        }

        public void setEquipamentosMultimidia(boolean equipamentosMultimidia) {
            this.equipamentosMultimidia = equipamentosMultimidia;
        }
    }

    // Enum: StatusReserva
    public enum StatusReserva {
        PENDENTE, CONFIRMADA, CANCELADA
    }
}
