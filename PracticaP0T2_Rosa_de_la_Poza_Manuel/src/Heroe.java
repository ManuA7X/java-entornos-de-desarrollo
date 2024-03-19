
public abstract class Heroe {

	String nombre;
	int intel, destre, fuerza, vida;
	boolean muerto;
	
	public Heroe() {}
	
	public Heroe (String nombre) {
		this.nombre = nombre;
		this.intel = 0;
		this.destre = 0;
		this.fuerza = 0;
		this.vida = 0;
		this.muerto = false;
	}
	
	
	abstract void atacar(Heroe heroe);
	
	abstract boolean esquivar();
	
	public abstract String obtenerTipo();
	
	@Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Inteligencia: " + this.intel + "\n" +
               "Fuerza: " + this.fuerza + "\n" +
               "Destreza: " + this.destre + "\n" +
               "Vida: " + this.vida + "\n" +
               "Tipo: " + obtenerTipo();
    }
}
