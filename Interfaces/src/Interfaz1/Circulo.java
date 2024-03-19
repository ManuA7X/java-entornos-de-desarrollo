package Interfaz1;

public class Circulo implements Figura, Dibujable, Rotable{

	double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public void rotar() {
	
	
	}

	@Override
	public void dibujar() {
	
	
	}

	@Override
	public double calcularArea() {
		double pi = 3.14;
		double resultado = pi * radio * radio;
		return resultado;
	}

}


