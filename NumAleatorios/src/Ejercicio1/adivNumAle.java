package Ejercicio1;

import java.util.Scanner;

public class adivNumAle {

	public static void main(String[] args) {
		
		//Creamos un scanner para pedir por teclado
		Scanner sc = new Scanner(System.in); 
		
		//Inicializamos las variables num y numRandom
		int num;
		int numRandom;
		
		//Damos un valor aleatorio a numRandom
        numRandom = (int)Math.floor(Math.random()*(100-0+1)+0);
        
        //Creamos un bucle for para el numero de intentos
        for(int i=0;i<5;i++) {
        	
        	//Pedimos un numero por teclado
        	System.out.println("Introduce un número");
    		System.out.println(" ");
        	num = sc.nextInt();
        	
        	//Se compara con un if, si no es, te quita un intento y te dice si es mayor o menor
        	if(num!=numRandom) {
        		System.out.println("Respuesta incorrecta");
        		System.out.println(" ");
        		System.out.println("Te quedan " + (4-i) + " intentos");
        		if(num<numRandom) {
        			System.out.println("El número es mayor.");
        			System.out.println(" ");
        		}else {
        			System.out.println("El número es menor");
        			System.out.println(" ");
        		}
        		
        	//Si has acertado saldra un mensaje por pantalla y se saldra del bucle
        	}else {
        		System.out.println("Has acertado!!");
        		break;
        	}
        	
        }
       
	}
	
}


