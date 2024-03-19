package app;

import modelos.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(1, 4);
		
		int area1 = r1.area();
		int perimetro2 = r2.perimetro();
		
		System.out.println("El area del rectangulo 1 es: " + area1);
		System.out.println("El perimetro del rectangulo 2 es: " + perimetro2);
	}

}
