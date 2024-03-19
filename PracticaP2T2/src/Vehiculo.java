
public abstract class Vehiculo {

	String nombre;
	int posx;
	int posy;
	
	public Vehiculo() {}

	public Vehiculo (String nombre) {}

	public abstract void avanzar();
	public abstract void retroceder();
	
}