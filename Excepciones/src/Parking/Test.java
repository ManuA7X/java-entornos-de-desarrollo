package Parking;

public class Test {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Parking parking1 = new Parking("Eskibidi", 4);
		parking1.entrada("M4678", 3);
		parking1.entrada("L9834", 1);
		
		System.out.println(parking1.toString());
		parking1.salida("M4678");
		System.out.println(parking1.toString());
	}

}
