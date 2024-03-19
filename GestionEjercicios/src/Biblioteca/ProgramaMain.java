package Biblioteca;

public class ProgramaMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("El señor de los anillos", "J.R.R. Tolkien", 1954);
        biblioteca.agregarLibro("El Mundo Perdido", "Michael Crichton", 1995);

        biblioteca.mostrarLibros();
	}

}
