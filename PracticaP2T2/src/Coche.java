
public class Coche extends Vehiculo {

	public Coche(String nombre) {
		super(nombre);
	}


	public void avanzar() {
		this.posx += 3;
	}

	public void retroceder() {
		this.posx -= 3;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPosx() {
		return posx;
	}
	
	public void setPosx(int posx) {
		this.posx = posx;
	}
	
	public int getPosy() {
		return posy;
	}
	
	public void setPosy(int posy) {
		this.posy = posy;
	}
}