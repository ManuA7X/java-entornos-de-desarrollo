package Pokemon;

public abstract class Pokemon {

	private int num_pokedex, temporadaQueAparece;
	private String nombrePokemon, sexo, tipo;
	private double pesoPokemon;
	
	public Pokemon(int num_pokedex, int temporadaQueAparece, String nombrePokemon, String sexo, String tipo,
			double pesoPokemon) {
		super();
		this.num_pokedex = num_pokedex;
		this.temporadaQueAparece = temporadaQueAparece;
		this.nombrePokemon = nombrePokemon;
		this.sexo = sexo;
		this.tipo = tipo;
		this.pesoPokemon = pesoPokemon;
	}
	
	public abstract void atacarPlacaje();
	
	public abstract void atacarAranazo();
	
	public abstract void atacarMordisco();

	public int getNum_pokedex() {
		return num_pokedex;
	}

	public void setNum_pokedex(int num_pokedex) {
		this.num_pokedex = num_pokedex;
	}

	public int getTemporadaQueAparece() {
		return temporadaQueAparece;
	}

	public void setTemporadaQueAparece(int temporadaQueAparece) {
		this.temporadaQueAparece = temporadaQueAparece;
	}

	public String getNombrePokemon() {
		return nombrePokemon;
	}

	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPesoPokemon() {
		return pesoPokemon;
	}

	public void setPesoPokemon(double pesoPokemon) {
		this.pesoPokemon = pesoPokemon;
	}
	
	
}
