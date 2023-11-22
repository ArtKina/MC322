package biblioteca.controllers.itens.multimidias;

import biblioteca.controllers.*;
import java.util.List;

// Interface do Factory
interface IMultimidiaFactory {
	Multimidia criarMultimidia(String titulo, String autor, String editora, int anoPublicacao, String genero,
			String sinopse, String imagem, int id);
}

// Classe abstrata do ItemMultimedia
public class Multimidia {
	private static Multimidia instanciaUnica; // Campo para armazenar a única instância

	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	private String genero;
	private String sinopse;
	private String imagem;
	private int id;
	private List<Comentario> membros;

	// Construtor privado para evitar a criação de instâncias fora da classe
	protected Multimidia(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse,
			String imagem, int id) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.genero = genero;
		this.sinopse = sinopse;
		this.imagem = imagem;
		this.id = id;
	}

	// Método estático para obter a instância única
	public static Multimidia getInstance(String titulo, String autor, String editora, int anoPublicacao, String genero,
			String sinopse, String imagem, int id) {
		if (instanciaUnica == null) {
			instanciaUnica = new Multimidia(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem, id);
		}
		return instanciaUnica;
	}

	// Factory Method para criar instâncias de multimídia
	public static Multimidia criarMultimidia(IMultimidiaFactory factory, String titulo, String autor, String editora,
			int anoPublicacao, String genero, String sinopse, String imagem, int id) {
		return factory.criarMultimidia(titulo, autor, editora, anoPublicacao, genero, sinopse, imagem, id);
	}

	// Getters e Setters para acessar os atributos privados
	public String getTitulo() {
		return titulo;
	}

	public Integer getId() {
		return id;
	}

	public String getAutor() {
		return autor;
	}

	// Classe Interna Audio
	public static class Audio extends Multimidia {
		public Audio(String titulo, String autor) {
			super(titulo, autor, null, 0, null, null, null, 0);
		}
	}

	// Classe Interna Video
	public static class Video extends Multimidia {
		public Video(String titulo, String autor) {
			super(titulo, autor, null, 0, null, null, null, 0);
		}
	}

	// Classe Interna Software
	public static class Software extends Multimidia {
		public Software(String titulo) {
			super(titulo, null, null, 0, null, null, null, 0);
		}
	}

}

// Concrete Creator: Factory para Áudio
class AudioFactory implements IMultimidiaFactory {
	@Override
	public Multimidia criarMultimidia(String titulo, String autor, String editora, int anoPublicacao, String genero,
			String sinopse, String imagem, int id) {
		return new Multimidia.Audio(titulo, autor);
	}
}

// Concrete Creator: Factory para Vídeo
class VideoFactory implements IMultimidiaFactory {
	@Override
	public Multimidia criarMultimidia(String titulo, String autor, String editora, int anoPublicacao, String genero,
			String sinopse, String imagem, int id) {
		return new Multimidia.Video(titulo, autor);
	}
}

// Concrete Creator: Factory para Software
class SoftwareFactory implements IMultimidiaFactory {
	@Override
	public Multimidia criarMultimidia(String titulo, String autor, String editora, int anoPublicacao, String genero,
			String sinopse, String imagem, int id) {
		return new Multimidia.Software(titulo);
	}
}
