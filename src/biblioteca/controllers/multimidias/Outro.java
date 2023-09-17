package biblioteca.controllers.multimidias;

public class Outro extends Multimidia{
	private String tipo;
	private String formato;
	private int nCopias;
	private int nCopiasDisponiveis;
	private String[] localizacao;
	private String estadoConservacao;
	
	public Outro(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String imagem, String tipo, String formato, int nCopias, int nCopiasDisponiveis, String [] localizacao, String estadoConservacao) {
		super(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem);
		this.tipo = tipo;
		this.formato = formato;
		this.nCopias = nCopias;
		this.nCopiasDisponiveis = nCopiasDisponiveis;
		this.localizacao = localizacao;
		this.estadoConservacao = estadoConservacao;
		
	}
}
