
public class Elfo extends Heroe{

	public Elfo(String nombre) {
		super(nombre);
		this.intel = (int)(Math.random()*(12-5)+5);
		this.destre = (int)(Math.random()*(20-10)+10);
		this.fuerza = (int)(Math.random()*(15-7)+7);
		this.vida = (int)(Math.random()*(12-5)+5);
	}
	
	public void rapidez() {
		if(this.fuerza >= 6) {
			this.fuerza -= 5;
			this.destre += 4;
			System.out.println(nombre + " ha usado RAPIDEZ. Ahora su DESTREZA es " + this.destre + 
					" y su FUERZA es " + this.fuerza + " .");
		}
	}
	
	@Override
	boolean esquivar() {
		int num = 0;
		num = (int)(Math.random()*50)+4;
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
		defensor.vida = this.fuerza/3;
		System.out.println("Cagaste. Te quedan " + defensor.vida + " puntos de VIDA.");
	}
	
	@Override
	public String obtenerTipo() {
		return "Elfo";
	}
}
