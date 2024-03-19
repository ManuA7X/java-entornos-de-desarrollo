package Supermercado;

public class Detergente implements EsLiquido, ConDescuento{

	String marca;
	double precio;
	
	public Detergente(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void setDescuento(double des) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public double getDescuento() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public void setVolumen(double v) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public double getVolumen() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public void setTipoEvase(String env) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public String getTipoEnvase() {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
}
