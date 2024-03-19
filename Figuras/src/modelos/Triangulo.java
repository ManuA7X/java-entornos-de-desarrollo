package modelos;

public class Triangulo {

	private int base;
    private int altura;
    
    public Triangulo() {
    	this.altura = 1;
    	this.base = 1;
    }
    
    public Triangulo(int base, int altura) {
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

    public int Perimetro() {
        return this.altura*this.base;
    }

}