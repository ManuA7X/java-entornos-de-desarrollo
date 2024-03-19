
public class Sustituto extends ShinMestizo{
	
    private String zonaAsignada;   

    public Sustituto(String nombre, int edad, String origen, String zonaAsignada) {
		super(nombre, edad, origen);
		this.zonaAsignada = zonaAsignada;
	}

    public void vigilar() {
        System.out.println("El shinigami sustituto " + nombre + " vigila la zona asignada.");
    }

    @Override
    public String toString() {
        return "Nombre del shinigami: " + nombre + " [vida: " + vida + ", poder: " + poder + "] Shinigami Sustituto\nDatos de su Zanpakuto";
    }

    public void invocarBankai() {
        if (!this.estado) {
            int ataqueTransformado = (poder * getPorcentajeHollow()) / 10;
            int resistenciaTransformada = 2 * poder;

            System.out.println(nombre + " ha invocado su bankai.");
            System.out.println("Ataque de la Zanpakuto transformada: " + ataqueTransformado);
            System.out.println("Resistencia de la Zanpakuto transformada: " + resistenciaTransformada);

            this.estado = true;
        } else {
            System.out.println("El bankai ya ha sido invocado anteriormente.");
        }
    }

    public void pelear(Sustituto defensor) {
        if (defensor != null) {
            int ataqueDefensor = defensor.getPoder();
            int resistenciaDefensor = defensor.getPoder() * 2;
            int vidaDefensor = defensor.getVida();

            int danio = Math.abs(ataqueDefensor - resistenciaDefensor);
            vidaDefensor -= danio;

            System.out.println(nombre + " ataca a " + defensor.getNombre() + " con una Zanpakuto de poder " + poder);
            System.out.println("El defensor pierde " + danio + " puntos de vida.");

            defensor.setVida(vidaDefensor);
        } else {
            System.out.println("No se puede combatir contra un shinigami nulo.");
        }
    }

    private int getPorcentajeHollow() {
        return 50;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(String zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }
}
