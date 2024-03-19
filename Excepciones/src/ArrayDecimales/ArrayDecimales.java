package ArrayDecimales;

import java.util.Scanner;

public class ArrayDecimales {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);
		
		try {
			int longitud;
			System.out.println("¿Cuántos valores quieres que tenga el Array?");
			longitud=sc.nextInt();
    
			int[] numeros = new int[longitud];
			for(int i=0;i<longitud;i++){
				System.out.println("Ingrese valores: ");
				numeros[i]=longitud;
    
			}

		}catch(Exception e) {
			
		}
	}
}
