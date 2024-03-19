import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class Aplicacion4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String line = null;
		int min = 0;
		int max = 0;
		int contmin = 0;
		int contmax = 0;
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("C:/Users/MEDAC_TARDE/Desktop/numeros.txt")); //Lee el archivo de texto
			line = reader.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		min = Integer.parseInt(line);
		
		while (line != null) {
			if(Integer.parseInt(line)>=max) {
				if(Integer.parseInt(line)==max) {
					contmax++;
					
				}else {
					contmax = 1;
					
				}
				max = Integer.parseInt(line);
				
			}
			if(Integer.parseInt(line)<=min) {
				if(Integer.parseInt(line)==min) {
					contmin++;
					
				}else {
					contmin = 1;
					
				}
				min = Integer.parseInt(line);
				
			}
			try {
				line = reader.readLine();
				
			}catch (IOException ex){
				Logger.getLogger(line);
			}
		}
		System.out.println("El mayor es " + max);
		System.out.println("El menor es " + min);
		System.out.println("Mayor aparece " + contmax + " veces");
		System.out.println("Mayor aparece " + contmin + " veces");
	}

}
