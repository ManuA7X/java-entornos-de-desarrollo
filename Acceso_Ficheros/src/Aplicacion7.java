import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacion7 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo de texto (o deja vacío para 'numeros.txt'): ");
        String nombreArchivo = scanner.nextLine(); 

        if (nombreArchivo.isEmpty()) {
            nombreArchivo = "numeros"; // Archivo por defecto
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/MEDAC_TARDE/Desktop/" + nombreArchivo + ".txt"));

            String linea;
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
	}

}
