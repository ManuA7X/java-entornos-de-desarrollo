import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {

	public void escribe(String texto) {
		
		try {
			
			FileWriter salida = new FileWriter("C:/Users/MEDAC_TARDE/Desktop/ejemplo.txt");
			
			salida.write(texto);
			salida.close();	
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
}
