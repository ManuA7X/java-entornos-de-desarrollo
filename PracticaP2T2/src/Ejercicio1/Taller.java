package Ejercicio1;

public class Taller extends Asignaturas implements EsPractica{
	
	double nota;

	public Taller(int codigo, String temario) {
		super(codigo, temario);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public void realizarPractica() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Práctica iniciada");
	}

	@Override
	public void asignarCalificacion(double calificacion) {
		// TODO Esbozo de método generado automáticamente
		super.asignarCalificacion(calificacion);
		
		System.out.println("La nota asignada es: " + calificacion);
	}

	@Override
	public double obtenerCalificacion() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Calificacion: ");
		return super.obtenerCalificacion();
	}

	@Override
	public boolean estaAprobada() {
		// TODO Esbozo de método generado automáticamente
		
		return super.estaAprobada();
	}

	@Override
	public int getCodigo() {
		// TODO Esbozo de método generado automáticamente
		return super.getCodigo();
	}

	@Override
	public void setCodigo(int codigo) {
		// TODO Esbozo de método generado automáticamente
		super.setCodigo(codigo);
	}

	@Override
	public String getTemario() {
		// TODO Esbozo de método generado automáticamente
		return super.getTemario();
	}

	@Override
	public void setTemario(String temario) {
		// TODO Esbozo de método generado automáticamente
		super.setTemario(temario);
	}

	@Override
	public String toString() {
		return "Taller [obtenerCalificacion()=" + obtenerCalificacion() + ", estaAprobada()=" + estaAprobada()
				+ ", getCodigo()=" + getCodigo() + ", getTemario()=" + getTemario() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
