import java.io.FileReader;
import java.io.IOException;

public class Leer_Fichero {

	public void lee() {
		
		try {
			
			FileReader entrada = new FileReader("C:/Users/MEDAC_TARDE/Desktop/ejemplo.txt");
			
			int letra = 0;
			
			while(letra != -1) {
				
				letra = entrada.read();
				
				System.out.print((char)letra);
				
			}
			entrada.close();
			
		} catch(IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
	}
}
