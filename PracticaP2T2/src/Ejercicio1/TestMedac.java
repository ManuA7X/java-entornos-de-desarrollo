package Ejercicio1;

public class TestMedac {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Marketing mk1 = new Marketing(2453, "Tema 1");
		Taller taller1 = new Taller(4536, "Tema 4");
		
		mk1.asignarCalificacion(6);
		mk1.estaAprobada();
		taller1.asignarCalificacion(4);
		taller1.estaAprobada();
	}

}
