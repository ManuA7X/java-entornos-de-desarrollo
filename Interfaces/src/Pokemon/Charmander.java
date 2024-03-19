package Pokemon;

public class Charmander extends Pokemon implements Fuego{

	public Charmander(int num_pokedex, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo,
			double pesoPokemon) {
		super(num_pokedex, temporadaQueAparece, nombrePokemon, sexo, tipo, pesoPokemon);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void atacarPunioFuego() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() +  " y estoy atacando con PUÑO FUEGO");
	}

	@Override
	public void atacarAscuas() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con ASCUAS");
	}

	@Override
	public void atacarLanzallamas() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con LANZALLAMAS");
	}

	@Override
	public void atacarPlacaje() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con PLACAJE");
	}

	@Override
	public void atacarAranazo() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con ARAÑAZO");
	}

	@Override
	public void atacarMordisco() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con MORDISCO");
	}

}
