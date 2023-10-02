package biblioteca.controllers.itens.multimidias;

public class LivroEletronico extends Multimidia{
    // Atributos da classe
    private String formato;
    private int nLicencas;
    private String url;
    private String requisitos;
    private String dataDisponibilidade;

    //Construtor
    public LivroEletronico(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String imagem,int id, String formato, int nLicencas,String url, String requisitos, String dataDisponibilidade) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem, id);
        this.formato = formato;
        this.nLicencas = nLicencas;
        this.url = url;
        this.requisitos = requisitos;
        this.dataDisponibilidade = dataDisponibilidade;
    }

    //Getters para acessar os atributos privados

    //Método
    public void determinarEmprestimo(){
        System.out.println("O livro foi emprestado!");
    }
}
