import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Escribe tu edad");
		int edad = sc.nextInt();
		
		try {
			File file = new File("C:/Users/MEDAC_TARDE/Desktop/datos.txt");
			
			if(file.exists()) {
				boolean fileCreated = file.createNewFile();
				
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				writer.write(" ");
				writer.close();
			
			if (fileCreated) {
				System.out.println("El archivo se creó correctamente");
				
			}else {
				System.out.println("Datos guardados en el fichero datos.txt");
			}
			
			}else {
				boolean fileCreated = file.createNewFile();
				
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				writer.write("Nombre: " + nombre);
				writer.newLine();
				writer.write("Edad: " + edad);
				writer.newLine();
				writer.write("Datos guardados en el fichero datos.txt");
				writer.close();
			
			if (fileCreated) {
				System.out.println("El archivo se creó correctamente");
				
			}else {
				System.out.println("Datos guardados en el fichero datos.txt");
			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
