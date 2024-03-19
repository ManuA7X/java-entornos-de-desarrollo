package CadenaTexto;

import java.util.Scanner;

public class CadenaTexto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String texto;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una palabra: ");
		
		texto = sc.next();
		
		System.out.println("Dime un número: ");
		
		num = sc.nextInt();
		
		try {
		
		System.out.println("La letra que corresponde a la posición " + num + " es: " + texto.charAt(num-1));
		
		}catch(Exception e) {
			System.out.println("No existe la posición " + num + " en la cadena");
		}
		
	}

}
