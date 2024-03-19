package Ejercicio1;

public abstract class Asignaturas implements EsEvaluable{

	private int codigo;
	private String temario;
	
	public Asignaturas(int codigo, String temario) {
		this.codigo = codigo;
		this.temario = temario;
	}
	
	@Override
	public void asignarCalificacion(double calificacion) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public double obtenerCalificacion() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public boolean estaAprobada() {
		// TODO Esbozo de método generado automáticamente
		
		return false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTemario() {
		return temario;
	}

	public void setTemario(String temario) {
		this.temario = temario;
	}
	
}
