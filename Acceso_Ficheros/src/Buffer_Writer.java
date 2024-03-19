import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Writer {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		try {
			BufferedWriter writer = new BufferedWriter (new FileWriter("C:/Users/MEDAC_TARDE/Desktop/ejemplo.txt", true)); //Permite escribir sin sobreescribir
			writer.write("\nHola Mundo");
			writer.newLine(); //crea una nueva linea
			writer.write("Este es un ejemplo de BufferedWriter en Java");
			writer.close();
			System.out.println("Datos escritos correctamente");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
