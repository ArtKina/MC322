package biblioteca.controllers.emprestimos;

public class SecoesRelatorio {
    private String titulo;
    private String conteudo;

    public SecoesRelatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
