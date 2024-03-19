
public class Teniente extends ShinPuros {
	
	public Teniente(String nombre, int edad, String origen, int numeroEscuadron) {
		super(nombre, edad, origen, numeroEscuadron);
	}

    @Override
    public String toString() {
        return "Nombre del shinigami: " + getNombre() + " [vida: " + getVida() + ", poder: " + getPoder() + "] Teniente del escuadrón " + escuadron + "\nDatos de su Zanpakuto";
    }

    @Override
    public void invocarBankai() {
        System.out.println(getNombre() + " aún no puede invocar su bankai");
    }

    @Override
    public void pelear(Sustituto defensor) {
        if (defensor != null) {
            int ataqueDefensor = defensor.getPoder();
            int resistenciaDefensor = defensor.getPoder() * 2;
            int vidaDefensor = defensor.getVida();

            int danio = Math.abs(ataqueDefensor - resistenciaDefensor);
            vidaDefensor -= danio;

            System.out.println(getNombre() + " ataca a " + defensor.getNombre() + " con una Zanpakuto de poder " + getPoder());
            System.out.println("El defensor pierde " + danio + " puntos de vida.");

            defensor.setVida(vidaDefensor);
        } else {
            System.out.println("No se puede combatir contra un shinigami nulo.");
        }
    }
}
