package ejemplo1;

import java.util.Scanner;

public class EjemploExcepciones1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);
		
			int num;
			
		try {	
			
			System.out.println("Introduce 6 números enteros");
			
			num = sc.nextInt();
			
			for(int i=0; i<5;i++) {
				num = sc.nextInt();
			}
			
			for(int i=0; i<5; i++) {}
			
		} catch(Exception e) {
			System.out.println("No metas decimales");
			
		}finally {
			System.out.println("Fin del programa");
		}
		
	}

}
