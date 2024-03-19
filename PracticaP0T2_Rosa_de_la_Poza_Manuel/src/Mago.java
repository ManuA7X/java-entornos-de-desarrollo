
public class Mago extends Heroe{

	public Mago(String nombre) {
		super(nombre);
		this.intel = (int)(Math.random()*(20-10)+10);
		this.destre = (int)(Math.random()*(12-5)+5);
		this.fuerza = (int)(Math.random()*(8-3)+3);
		this.vida = (int)(Math.random()*(10-2)+2);
	}
	
	public void curarse() {
		if(this.vida == 10) {
			System.out.println("Ya tienes la vida al máximo.");
		}else if(this.vida >= 7 && this.vida<=9) {
			this.vida = 10;
			System.out.println(nombre + " se ha curado al máximo."); 
		}else {
			this.vida += 3;
			System.out.println(nombre + " se ha curado 3 puntos.");
		}
		
	}
	
	@Override
	boolean esquivar() {
		int num = 0;
		num = (int)(Math.random()*40)+2;
		if(num<this.destre) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	void atacar(Heroe defensor) {
		if(esquivar()) {
			System.out.println("Has esquivado.");
		}else {}
		defensor.vida = this.fuerza/2;
		System.out.println("Cagaste. Te quedan " + defensor.vida + " puntos de VIDA.");
	}
	
	@Override
	public String obtenerTipo() {
		return "Mago";
	}
}
