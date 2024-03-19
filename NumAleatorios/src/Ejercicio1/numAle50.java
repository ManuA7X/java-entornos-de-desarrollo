package Ejercicio1;

public class numAle50 {

	public static void main(String[] args) {
		
		//Inicializamos num como entero
				int num;
				
				//Creamos un bucle for con una cantidad max de 50 numeros
				for(int i=0;i<50;i++) {
				
			    //Asignamos a num un valor aleatorio que comprenda del 100 al 199 
				num = (int)Math.floor(Math.random()*(199-100+1)+100);
				
				//Mostramos por pantalla num junto a un espacio
				System.out.print(num);
				System.out.print(" ");
				
				//Calculamos la media de cada número en el sout y la mostramos
				System.out.println("La media es: " + num/2);
				System.out.println(" ");
				
				}
				
	}

}
