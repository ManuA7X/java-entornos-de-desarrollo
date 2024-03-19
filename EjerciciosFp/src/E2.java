import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		/*Realiza un programa que lea 10 números por teclado y que muestre la media de los números primos
introducidos. Los números que no son primos se ignoran. Si el usuario no ha introducido ningún
número primo, se mostrará el mensaje: “No ha introducido ningún número primo, no puedo calcular la
media”.*/
		
		double cuenta=0;
		int nums=0;
		int sumador=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 10 números positivos: ");
		
		//se introducen 10 numeros positivos
		for(int i=0;i<10;i++) {
			nums = sc.nextInt();
			boolean primo=false;
			
			//de los numeros introducidos selecciona solo los primos
			for(int j=2; j<nums;j++) {
				if(nums%j==0) {
					primo=true;
				}
			
			//ignora los que no son primos y suma los que son primos
			if(!primo) {
				cuenta += nums;
				sumador++;
				}
			
			}
			
		}
		
		//si no introduces ningun primo te saldra ese mensaje
		if(sumador==0) {
			System.out.println("No has introducido ningún primo, no puedo calcular la media.");
		
		//si no es el caso hara la media y la mostrara por pantalla
		}else {
			double media=cuenta/sumador;
			System.out.println("La media de los primos es: " + media);
			}
		
	}

}
