import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aplicacion6 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String archivo = "C:/Users/MEDAC_TARDE/Desktop/margarita.txt";
        try {
            int caracteres = 0;
            int palabras = 0;
            int lineas = 0;
            
            FileReader file = new FileReader(archivo);
            BufferedReader reader = new BufferedReader(file);
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas++;
                caracteres += linea.length();
                palabras += contarPalabras(linea);
            }
            
            reader.close();
            
            System.out.println("Número de caracteres: " + caracteres);
            System.out.println("Número de palabras: " + palabras);
            System.out.println("Número de líneas: " + lineas);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static int contarPalabras(String linea) {
        String[] palabras = linea.split("\\s+"); // Dividir la línea por espacios en blanco
        return palabras.length;
    }
	

}
