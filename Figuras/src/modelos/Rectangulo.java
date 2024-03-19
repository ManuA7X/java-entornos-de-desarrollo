package modelos;

public class Rectangulo {

	private int base;
	private int altura;
	
	
	public Rectangulo() {
    	this.altura = 1;
    	this.base = 1;
    }
	
    public Rectangulo(int base, int altura) {
    	this.base = base;
    	this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return this.base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return this.altura;
    }

    public int area() {
    	return this.base*this.altura;
    }

    public int perimetro() {
    	return 2*this.base + 2*this.altura;
    }

}