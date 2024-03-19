import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

Scanner sc = new Scanner(System.in);
		
		String nombre = "S";
		File file = new File("C:/Users/MEDAC_TARDE/Desktop/EJ113.dat.txt");
		BufferedWriter writer = null;
		FileWriter frase = null;
		
		try {
			frase = new FileWriter(file);
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		writer = new BufferedWriter(frase);
		
		while(!nombre.isBlank()) {
			System.out.println("Escribe una frase");
			nombre = sc.nextLine();
			try {
				writer.append(nombre);
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
			try {
				writer.newLine();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}

}
