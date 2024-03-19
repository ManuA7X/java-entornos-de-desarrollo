package Pokemon;

public class Bulbasur extends Pokemon implements Planta{

	public Bulbasur(int num_pokedex, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo,
			double pesoPokemon) {
		super(num_pokedex, temporadaQueAparece, nombrePokemon, sexo, tipo, pesoPokemon);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void atacarParalizar() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con PARALIZAR");
	}

	@Override
	public void atacarDrenaje() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con DRENAJE");
	}

	@Override
	public void atacarHojaAfilada() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con HOJA AFILADA");
	}

	@Override
	public void atacarLatigoCepa() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Soy " + this.getNombrePokemon() + " y estoy atacando con LATIGO CEPA");
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
