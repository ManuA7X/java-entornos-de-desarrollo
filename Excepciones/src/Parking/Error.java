package Parking;

public class Error extends Exception{

	private static final long serialVersionUID = 1L;

	public Error(String mensaje) {
		super(mensaje);
	}
}
