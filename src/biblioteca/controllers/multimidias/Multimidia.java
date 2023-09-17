package biblioteca.controllers.multimidias;

public class Multimidia {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	private String genero;
	private String sinopse;
	private String imagem;
	
	//Construtor
	public Multimidia(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse, String imagem) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao; 
		this.genero = genero;
		this.sinopse = sinopse;
		this.imagem = imagem;
	}
	
    //Getters e Setters para acessar os atributos privados
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
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
    //Método
    public void determinarEmprestimo(){
        System.out.println("O item multimidia foi emprestado!");
    }
	}
}
