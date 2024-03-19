package Biblioteca;

public class Libro {
	
	private String titulo, autor;
	private int anoPublicacion;
	
	public Libro() {}
	
	//Constructor 
	public Libro(String titulo, String autor, int anoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
	}
	
	//Getter y Setter
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
}
