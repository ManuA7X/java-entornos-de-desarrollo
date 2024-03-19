package modelos;

public class Circulo {

    private double circunferencia;

    public Circulo() {
        this.circunferencia = 1.0;
    }

    public Circulo(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public double getCircunferencia() {
        return this.circunferencia;
    }

    public double Radio() {
        return circunferencia/(2*3.14);
    }

}