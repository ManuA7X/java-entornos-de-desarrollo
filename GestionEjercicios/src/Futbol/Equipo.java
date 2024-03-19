package Futbol;

public class Equipo { //MÉTODO DE AGRAGACIÓN

	private String nombre;
	private Jugador [] jugadores;
	private int numJugadores = 0;
	
	public Equipo(String nombre, int numJugadores) {
		this.nombre = nombre;
		this.jugadores = new Jugador[11];
		this.numJugadores = 0;
	}
	
	public void agregarJugador(Jugador jugador) {
		if(numJugadores<jugadores.length) {
			jugadores[numJugadores] = jugador;
			numJugadores++;
			System.out.println("Jugador agregado con éxito");
		}else {
			System.out.println("El equipo está lleno, no se pueden agregar más jugadores");
		}
	}
	
	public void mostrarPlantilla() {
		System.out.println("Plantilla oficial de " + nombre + ":");
		for(int i=0;i<numJugadores;i++) {
			System.out.println("| Nombre: " + jugadores[i].getNombre() + "  Posición: " + jugadores[i].getPosicion() + "  Dorsal: " + jugadores[i].getDorsal());
		}
	}
}
