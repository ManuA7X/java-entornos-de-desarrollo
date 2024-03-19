
abstract class ShinPuros extends Shinigami {

	int numeroEscuadron;
	
    public ShinPuros(String nombre, int edad, String origen, int numeroEscuadron) {
		super(nombre, edad, origen);
		if (numeroEscuadron < 1 || numeroEscuadron > 13) {
            this.numeroEscuadron = (int)(Math.random()*(13-1)+1);
        } else {
            this.numeroEscuadron = numeroEscuadron;
        }
	}

    public void shunpo() {
        System.out.println(nombre + " se ha desplazado usando shunpo.");
    }
    
    abstract void invocarBankai();

    abstract void pelear(Shinigami otroShinigami);
}
