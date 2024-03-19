package PuntoCirculoCilindro;

public class Punto {

	private int posX;
	private int posY;
	
	public Punto() {}
	
	public Punto(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	@Override
	public String toString() {
		return "Punto en (" + posX + ", " + posY + ")";
	}
	
	public void trasladar(int a, int b) {
		this.posX += a;
		this.posY += b;
	}
}
