
abstract class ShinMestizo extends Shinigami{

	double porcentajeHollow;
    double porcentajeQuincy;   

    public ShinMestizo(String nombre, int edad, String origen) {
		super(nombre, edad, origen);
		this.porcentajeHollow = (int)(Math.random()*(50-10)+10);
		this.porcentajeQuincy = 50 - this.porcentajeHollow;
	}
    
    abstract void invocarBankai();

    abstract void pelear(Shinigami otroShinigami);
}
