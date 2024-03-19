import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class Aplicacion5 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		BufferedReader reader = null;
		String line = null;
		String frase;
		String fraseLarga;
		String ultima;
		int contador;
		
		try {
			reader = new BufferedReader(new FileReader("C:/Users/MEDAC_TARDE/Desktop/margarita.txt"));
			try {
				line = reader.readLine();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	        
	        System.out.println(frase);
	        
	        contador = frase.length();
	        
	        fraseLarga = frase;
	        
	        while (frase!=null) {
	            
	            if (frase.length()>contador) {
	                contador = frase.length();
	                fraseLarga = frase;
	            }
	            
	            try {
	                frase = reader.readLine();
	            } catch (IOException ex) {
	                
	            }
	        }
	        System.out.println(fraseLarga);
	    
	    
	        
	        contador = frase.length();
	        
	        fraseLarga = frase;
	        
	        while (frase!=null) {
	            
	            if (frase.length()>contador) {
	                contador = frase.length();
	                fraseLarga = frase;
	            }
	            
	            try {
	                frase = reader.readLine();
	                if (frase != null) {
	                    ultima = frase;
	                }
	                
	            } catch (IOException ex) {
	                
	            }
	        }
	        System.out.println(fraseLarga);
	        System.out.println(ultima);
	        
	      
	        
	        while (frase!=null) {        
	            System.out.println(frase);
	            try {
	                frase = reader.readLine();
	            } catch (IOException ex) {
	                Logger.getLogger();
	            }
	        }
	        
	    
	}

}
