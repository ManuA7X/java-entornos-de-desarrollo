package Pokemon;

public class TestMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Pikachu pika1 = new Pikachu(25, 1, "Paco", "Macho", "Eléctrico", 6.0);
		Charmander char1 = new Charmander(4, 1, "Felipe", "Macho", "Fuego", 8.5);
		Bulbasur bulb1 = new Bulbasur(1, 1, "Estefanía", "Hembra", "Planta", 6.9);
		Squirtle squi1 = new Squirtle(7, 1, "Seba", "Macho", "Agua", 9.0);
		
		pika1.atacarAranazo();
		char1.atacarLanzallamas();
		bulb1.atacarLatigoCepa();
		squi1.atacarHidrobomba();
	}

}
