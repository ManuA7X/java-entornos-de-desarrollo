package Supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{
	String marca, tipo_cereal;
	double precio;
	LocalDate caducidad;
	
	public Cereales(String marca, String tipo_cereal, double precio) {
		this.marca = marca;
		this.tipo_cereal = tipo_cereal;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo_cereal() {
		return tipo_cereal;
	}

	public void setTipo_cereal(String tipo_cereal) {
		this.tipo_cereal = tipo_cereal;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}
	

	@Override
	public LocalDate getCaducidad() {
		return caducidad;
	}
	

	@Override
	public int getCalorias() {
		if(this.tipo_cereal.equalsIgnoreCase("Espelta")) {
		return 5;
		}else if(this.tipo_cereal.equalsIgnoreCase("Maíz")) {
			return 8;
		}else if(this.tipo_cereal.equalsIgnoreCase("Trigo")) {
			return 12;
		}else {
			return 15;
		}
	}
	
}
