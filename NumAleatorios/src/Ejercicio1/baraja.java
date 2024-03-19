package Ejercicio1;

import java.util.Random;

public class baraja {

	public static void main(String[] args) {
		
		//Inicializamos cada palo
		String palo1, palo2, palo3, palo4;
		
		//Nombramos cada palo con el nombre que queremos que tenga
		palo1 = "Corazones";
		palo2 = "Picas";
		palo3 = "Tréboles";
		palo4 = "Diamantes";
		
		//Creamos un array unidimensional de tipo String para incluir números y letras
		String baraja [] = new String [13]; 
			baraja [0] = "2";
			baraja [1] = "3";
			baraja [2] = "4";
			baraja [3] = "5";
			baraja [4] = "6";
			baraja [5] = "7";
			baraja [6] = "8";
			baraja [7] = "9";
			baraja [8] = "10";
			baraja [9] = "A";
			baraja [10] = "J";
			baraja [11] = "Q";
			baraja [12] = "K";
			
			//Importamos el random para aleatorizar el palo y el numero que le corresponde
			Random random = new Random();
	        int indicePalo = random.nextInt(4);  
	        int indiceNumero = random.nextInt(13);
	        
	        //Creamos un switch para almacenar los datos aleatorios por palos
	        String paloElegido = "";
	        switch (indicePalo) {
	            case 0:
	                paloElegido = palo1;
	                break;
	            case 1:
	                paloElegido = palo2;
	                break;
	            case 2:
	                paloElegido = palo3;
	                break;
	            case 3:
	                paloElegido = palo4;
	                break;
	        }
	        
	        //Creamos un tipo String con todos los datos
	        String cartaElegida = baraja[indiceNumero] + " de " + paloElegido;
	        
	        //Mostramos por pantalla todo
	        System.out.println("Carta elegida: " + cartaElegida);
			
	}

}
