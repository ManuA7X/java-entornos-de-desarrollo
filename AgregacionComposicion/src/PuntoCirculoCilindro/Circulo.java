package PuntoCirculoCilindro;

public class Circulo {

	private double radio;
	private Punto centro;
	
	public Circulo(int posX, int posY, double radio) {
		this.centro = new Punto(posX, posY);
		this.radio = radio;
	}
	
	public double calcularArea(double radio) {
		return Math.PI * (radio * radio);
	}
	
	public double calcularPerimetro(double radio) {
		return Math.PI * (2 * radio);
	}
}
