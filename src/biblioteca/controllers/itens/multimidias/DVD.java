package biblioteca.controllers.itens.multimidias;

public class DVD extends Multimidia{
    // Atributos da classe
    private String[] listaFaixas;
    private int duracaoTotal;
    private int nCopias;
    private int nCopiasDisponiveis;
    private String legendas;
    private String audio;
    private String estadoConservacao;

    //Construtor
    public DVD(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String imagem, int id, String[] listaFaixas, int durcaoTotal, int nCopias, int nCopiasDisponiveis, String audio, String legendas, String estadoConservacao) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem, id);
        this.listaFaixas = listaFaixas;
        this.duracaoTotal = durcaoTotal;
        this.nCopias = nCopias;
        this.nCopiasDisponiveis = nCopiasDisponiveis;
        this.legendas = legendas;
        this.audio = audio;
        this.estadoConservacao = estadoConservacao;
    }

}
