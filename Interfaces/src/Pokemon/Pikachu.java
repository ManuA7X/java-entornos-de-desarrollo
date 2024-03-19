package Pokemon;

public class Pikachu extends Pokemon implements Electrico{

	public Pikachu(int num_pokedex, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo,
			double pesoPokemon) {
		super(num_pokedex, temporadaQueAparece, nombrePokemon, sexo, tipo, pesoPokemon);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void atacarImpactrueno() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con IMPACTRUENO");
	}

	@Override
	public void atacarPunioTrueno() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con PUÑO TRUENO");
	}

	@Override
	public void atacarRayo() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con RAYO");
	}

	@Override
	public void atacarRayoCarga() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con RAYO CARGA");
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
