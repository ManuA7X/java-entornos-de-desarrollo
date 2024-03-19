package Biblioteca;

public class Biblioteca { //MÉTODO DE COMPOSICIÓN
	
	//Hacemos un array vacío y un contador por defecto en 0
	private Libro [] libros;
	private int numLibros = 0;
	
	//Hacemos el constructor y le damos la cantidad de libros máxima
	public Biblioteca() {
		this.libros = new Libro[5];
		this.numLibros = 0;
	}
	
	//Funcion agregarLibro
	public void agregarLibro(String titulo, String autor, int anoPublicacion) {
		Libro libro = new Libro(titulo, autor, anoPublicacion);
		//Configuramos que solo introduzca libros solo si hay espacio
		if(numLibros<libros.length) {
			libros[numLibros] = libro;
			numLibros++;
			System.out.println("Libro agregado con éxito");
		}else {
			System.out.println("La biblioteca esta llena, no se puede agregar más libros");
		}
	}
	
	//Función mostrarLibros para poder ver la info en el main
	public void mostrarLibros() {
		System.out.println("Libros en la biblioteca:");
		for(int i=0;i<numLibros;i++) {
			Libro libro = libros[i];
			System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año de Publicación: " + libro.getAnoPublicacion());
		}
	}
}
