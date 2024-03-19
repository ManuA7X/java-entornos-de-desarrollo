import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
	/*La compañía automovilística Ñesla nos ha encargado un configurador para calcular el precio de su
		coche eléctrico. Los dos modelos que tiene a la venta son el Ñesla Modelo 5 y el Ñesla Modelo 8,
		que tienen un precio base de 30.000 € y 36.000 € respectivamente. El Modelo 5 se puede encargar
		con batería de 50 kWh o de 70 kWh mientras que el modelo 8 se puede pedir con 80 kWh o con 120
		kWh. En todos los casos, cada kWh de batería se paga a 125 €. El Modelo 8 (solo este modelo) se
		puede encargar con el paquete de conducción autónoma, que cuesta 1800 €. Todos los coches
		eléctricos cuentan con una subvención del gobierno del 5% del precio final del vehículo. No hay que
		considerar el IVA, ya está incluido en todas las tarifas.*/
		
		char letra, letra2, letra3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleccione el tipo de coche (a) Modelo 5 (b) Modelo 8: ");
		letra=sc.next().charAt(0);
		
		if(letra=='a') {
			System.out.println("Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: ");
			letra2=sc.next().charAt(0);
			
			if(letra2=='a') {
				System.out.println("Precio base			30000.00€");
				System.out.println("Batería de 50 kWh	 	 6250.00€");
				System.out.println("Subvención estatal		-1812.50€");
				System.out.println("Total				34437.50€");
			}else {
				System.out.println("Precio base			30000.00€");
				System.out.println("Batería de 70 kWh	 	 8750.00€");
				System.out.println("Subvención estatal		-1937.50€");
				System.out.println("Total				36812.50€");
			}
		}else {
			System.out.println("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: ");
			letra2=sc.next().charAt(0);
			System.out.println("¿Quiere el paquete de conducción autonoma? (s/n): ");
			letra3=sc.next().charAt(0);
			
			if(letra2=='a' && letra3=='s') {
				System.out.println("Precio base			36000.00€");
				System.out.println("Batería de 80 kWh	 	10000.00€");
				System.out.println("Subvención estatal		-2300.00€");
				System.out.println("Conducción autónoma      1800.00€");
				System.out.println("Total				45500.00€");
			}else if(letra2=='a' && letra3=='n') {
				System.out.println("Precio base			36000.00€");
				System.out.println("Batería de 80 kWh	 	10000.00€");
				System.out.println("Subvención estatal		-2300.00€");
				System.out.println("Sin conducción autónoma     	    0.00€");
				System.out.println("Total				43700.00€");
			}else if(letra2=='b' && letra=='s') {
				System.out.println("Precio base			36000.00€");
				System.out.println("Batería de 120 kWh	 	15000.00€");
				System.out.println("Subvención estatal		-2550.00€");
				System.out.println("Conducción autónoma      1800.00€");
				System.out.println("Total				50250.00€");
			}else {
				System.out.println("Precio base			36000.00€");
				System.out.println("Batería de 80 kWh	 	15000.00€");
				System.out.println("Subvención estatal		-2550.00€");
				System.out.println("Sin conducción autónoma     	    0.00€");
				System.out.println("Total				48450.00€");
			}
			
		}
		
	}

}
