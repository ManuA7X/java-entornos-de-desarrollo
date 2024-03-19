package Ejercicio1;

public class barajaEspanola {

	public static void main(String[] args) {
		
		int palo, carta;
		String paloNom[]= {"Corazones", "Treboles", "Picas", "Diamantes"};
		String cartaNom[]= {"A","2","3","4","5","6","7","8","9","J","Q","K"};
		
		palo = (int) (Math.floor(Math.random()*(3-0+1)+0));
		carta = (int) (Math.floor(Math.random()*(11-0+1)+0));
		
		System.out.println("Palo: "+ paloNom[palo] + " carta : "+ cartaNom[carta]);
		

	}

}
