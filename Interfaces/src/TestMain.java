
public class TestMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Persona personas[] = new Persona[3];
			personas[0] = new Persona("Chema", 12);
			personas[1] = new Persona("Pepelu", 21);
			personas[2] = new Persona("Juantxu", 9);
			
			Amigos a1 = new Amigos(personas);
			
			for(Persona p : a1.mayoresQue(12)) {
				System.out.println(p);
			}
	}

}
