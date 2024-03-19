import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_Reader {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/MEDAC_TARDE/Desktop/ejemplo.txt")); //Lee el archivo de texto
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
