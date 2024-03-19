//Manuel Rosa de la Poza

public class Zanpakuto {

	private String nombre;
    private double anchura, altura, ataque, resistencia;
    private boolean estado;

    public Zanpakuto(String nombre, double anchura, double altura) {
        this.nombre = nombre;
        this.anchura = anchura;
        this.altura = altura;
        this.ataque = (int)(Math.random()*(25-2)+2);
        this.resistencia = (int)(Math.random()*(150-70)+70);
        this.estado = true;
    }

	public void bankai(double multiplicadorAtaque, double multiplicadorResistencia) {
        this.ataque = (int) (this.ataque * multiplicadorAtaque);
        this.resistencia = (int) (this.resistencia * multiplicadorResistencia);
        this.estado = false;
    }

    public void shikai() {
        this.ataque = (int)(Math.random()*(25-2)+2);
        this.resistencia = (int)(Math.random()*(150-70)+70);
        this.estado = true;
    }

    @Override
    public String toString() {
        return nombre + " [atq: " + ataque + ", res: " + resistencia + "] " + (estado ? "shikai" : "bankai");
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getResistencia() {
		return resistencia;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
