
public abstract class Shinigami {

	protected String nombre;
    protected int edad;
    protected String origen;
    protected int vida = 1500;
    protected int poder;

    public Shinigami(String nombre, int edad, String origen) {
        this.nombre = nombre;
        this.edad = edad;
        this.origen = origen;
        this.poder = (int)(Math.random()*(50-5)+5);
    }

    abstract void invocarBankai();

    abstract void pelear(Shinigami otroShinigami);

    @Override
    public String toString() {
        return nombre + " [vida: " + vida + ", poder: " + poder + "]";
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}
    
    
}
