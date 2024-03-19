package Futbol;

public class ProgramaMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Jugador jugador1 = new Jugador("Roberto", "MCO", 15);
		Jugador jugador2 = new Jugador("Miguel", "DC", 11);
		Jugador jugador3 = new Jugador("Pedro", "DFC", 4);
		
		Equipo equipo = new Equipo("MEDAC FC", 3);
		
		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.mostrarPlantilla();
	}

}
