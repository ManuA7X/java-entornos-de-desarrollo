package Ejercicio1;

public class dado {

	public static void main(String[] args) {
		
		//Inicializamos los diferentes dados y la suma
		int dado1, dado2, dado3, suma;
		
		//Le damos el valor aleatorio a cada dado
		dado1 = (int)Math.floor(Math.random()*(6-1+1)+1);
		dado2 = (int)Math.floor(Math.random()*(6-1+1)+1);
		dado3 = (int)Math.floor(Math.random()*(6-1+1)+1);
		
		//Mostramos por pantalla el resultado de cada dado
		System.out.println("Dado 1 = " + dado1);
		System.out.println("Dado 2 = " + dado2);
		System.out.println("Dado 3 = " + dado3);
		
		//Realizamos la suma
		suma = dado1 + dado2 + dado3;
		
		//Mostramos por pantalla la suma
		System.out.println("Resultado = " + suma);
		
	}

}
