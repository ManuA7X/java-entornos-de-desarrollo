import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner scanner = new Scanner(System.in);
		
		String archivo;
		
		System.out.println("Introduce el nombre del archivo de texto: ");
        archivo = scanner.nextLine(); 
        try {
            
            int palabras = 0;
            
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/MEDAC_TARDE/Desktop/" + archivo + ".txt"));
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                palabras += contarPalabras(linea);
            }
            
            reader.close();
           
            System.out.println("Número de palabras: " + palabras);

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
	}
	
	 private static int contarPalabras(String linea) {
	        String[] palabras = linea.split("\\s+"); // Dividir la línea por espacios en blanco
	        return palabras.length;
	    }

}
