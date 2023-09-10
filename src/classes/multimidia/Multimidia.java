package classes.multimidia;

public class Multimidia {
    private static String titulo;
    private static FormatoMultimidia formato;

    public Multimidia(String titulo, FormatoMultimidia formato) {
        this.titulo = titulo;
        this.formato = formato;
    }

    // Getter para o título
    public String getTitulo() {
        return titulo;
    }

    // Setter para o título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para o formato
    public FormatoMultimidia getFormato() {
        return formato;
    }

    // Setter para o formato
    public void setFormato(FormatoMultimidia formato) {
        this.formato = formato;
    }

    //Classe Interna Audio
    public class Audio {
        public String titulo;
        public String autor;

        public Audio(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        // Getter para o título do áudio interno
        public String getTitulo() {
            return titulo;
        }

        // Setter para o título do áudio interno
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        // Getter para o autor do áudio interno
        public String getAutor() {
            return autor;
        }

        // Setter para o autor do áudio interno
        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    //Classe Interna Video
    public class Video {
        public String titulo;
        public String autor;

        public Video(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        // Getter para o título do vídeo interno
        public String getTitulo() {
            return titulo;
        }

        // Setter para o título do vídeo interno
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        // Getter para o autor do vídeo interno
        public String getAutor() {
            return autor;
        }

        // Setter para o autor do vídeo interno
        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    //Classe Interna Software
    public class Software {
        public String titulo;

        public Software(String titulo) {
            this.titulo = titulo;
        }

        // Getter para o título do software interno
        public String getTitulo() {
            return titulo;
        }

        // Setter para o título do software interno
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    }

    // Enum: FormatoMultimidia
    public enum FormatoMultimidia {
        AUDIO, VIDEO, SOFTWARE
    }
}
