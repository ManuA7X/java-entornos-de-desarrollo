import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Scanner sc = new Scanner(System.in);
		
		String fichero = null;
		
		System.out.print("Escriba el nombre del fichero: ");
		fichero = sc.nextLine();
		System.out.println("");
		
		System.out.println("Abriendo " + fichero + ".txt");
		System.out.println("");

		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/MEDAC_TARDE/Desktop/" + fichero + ".txt")); //Lee el archivo de texto
			String line;
			while ((line = reader.readLine())!= null){ //Permite leer línea por línea el fichero
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
