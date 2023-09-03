package classes.multimidias;

class CD extends Multimidia{
    // Atributos da classe
    private String[] listaFaixas; 
    private int duracaoTotal;
    private int nCopias;
    private int nCopiasDisponiveis;
    private String estadoConservacao;

    //Construtor
    public CD(String[] listaFaixas, int duracaoTotal, int nCopias, int nCopiasDisponiveis, String estadoConservacao) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem);
    }

}
