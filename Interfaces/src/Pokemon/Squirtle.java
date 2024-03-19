package Pokemon;

public class Squirtle extends Pokemon implements Agua{

	public Squirtle(int num_pokedex, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo,
			double pesoPokemon) {
		super(num_pokedex, temporadaQueAparece, nombrePokemon, sexo, tipo, pesoPokemon);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void atacarHidrobomba() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con HIDROBOMBA");
	}

	@Override
	public void atacarPistolaAgua() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con PISTOLA AGUA");
	}

	@Override
	public void atacarBurbuja() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con BURBUJA");
	}

	@Override
	public void atacarHidropulso() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con HIDROPULSO");
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
