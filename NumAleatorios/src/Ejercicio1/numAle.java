package Ejercicio1;

public class numAle {

	public static void main(String[] args) {
		
		//Inicializamos num como entero
		int num;
		
		//Creamos un bucle for con una cantidad max de 20 numeros
		for(int i=0;i<20;i++) {
		
	    //Asignamos a num un valor aleatorio que comprenda del 0 al 10
		num = (int)Math.floor(Math.random()*(10-0+1)+0);
		
		//Mostramos por pantalla num junto a un espacio
		System.out.print(num);
		System.out.print(" ");
		
		}
		
	}

}
