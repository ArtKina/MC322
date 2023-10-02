package biblioteca.controllers.itens.multimidias;

class CD extends Multimidia{
    // Atributos da classe
    private String[] listaFaixas; 
    private int duracaoTotal;
    private int nCopias;
    private int nCopiasDisponiveis;
    private String estadoConservacao;

    //Construtor
    public CD(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String imagem, int id, String[] listaFaixas, int duracaoTotal, int nCopias, int nCopiasDisponiveis, String estadoConservacao) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem, id);
        this.listaFaixas = listaFaixas;
        this.duracaoTotal = duracaoTotal;
        this.nCopias = nCopias;
        this.nCopiasDisponiveis = nCopiasDisponiveis;
        this.estadoConservacao = estadoConservacao;
    }

}
