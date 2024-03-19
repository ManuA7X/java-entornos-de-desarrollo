import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulacionArchivos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente	
		
		//Crear carpeta y archivo de texto
		File folder = new File("C:/Users/MEDAC_TARDE/Desktop/folder");
		File file = new File("C:/Users/MEDAC_TARDE/Desktop/folder/datos.txt");
		
		//Lanza la excepción cuando el archivo esté ya creado
		try {
			boolean folderCreated = folder.mkdir(); //Crea la carpeta
			boolean fileCreated = file.createNewFile(); //Crea el archivo de texto
			FileWriter escritura = new FileWriter(file); //Nos permite escribir en el archivo de texto
			escritura.write("Dime tu nombre>> Manu\r\n"
					+ "Edad>> 24\r\n"
					+ "Datos guardados en fichero datos.txt");
			escritura.close();
			
			if (folderCreated && fileCreated) {
				System.out.println("El archivo se creó correctamente");
				
			}else {
				System.out.println("El archivo ya existe");
			}
			
		}catch (IOException e) {
			System.out.println("Excepción al crear el archivo " + e);
			
		}
		
		//Permite leer el archivo
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
				
			}
			
		}catch (FileNotFoundException e){
			System.out.println("Excepción al crear el archivo " + e);
		}
		
		//Borra el archivo
		if (file.delete()) {
			System.out.println("El archivo se borró correctamente");
			
		}else {
			System.out.println("No se pudo borrar el archivo");
		}
		
	}

}
