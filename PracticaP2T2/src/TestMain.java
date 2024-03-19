
public class TestMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int random = (int) (Math.random() * (9 - 1 + 1) + 1);
        Camion c1 = new Camion("Camion");
        Moto m1 = new Moto("Moto");
        Coche o1 = new Coche("Coche");
        Vehiculo pista[][] = new Vehiculo[3][9];
        pista[0][c1.getPosx()] = c1;
        pista[1][m1.getPosx()] = m1;
        pista[2][o1.getPosx()] = o1;

        /*Cartas cartas[] = new Cartas[10];
        if (cartas[random].getEstado() % 2 == 0) {
            c1.avanzar();
        }*/

        mostrar(pista);
        
        c1.avanzar();
    }

    public static void mostrar(Vehiculo pista[][]) {
        for (int i = 0; i < pista.length; i++) {
            for (int j = 0; j < pista[i].length; j++) {
                if (pista[i][j] != null) {
                    System.out.print(pista[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        } 
	}
	
	

}
