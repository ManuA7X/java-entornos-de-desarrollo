
public class Guerrero extends Heroe{

	public Guerrero(String nombre) {
		super(nombre);
		this.intel = (int)(Math.random()*(5-3)+3);
		this.destre = (int)(Math.random()*(10-1)+1);
		this.fuerza = (int)(Math.random()*(25-10)+10);
		this.vida = (int)(Math.random()*(20-8)+8);
	}
	
	public void furia() {
		if(this.vida >= 7) {
			this.vida -= 6;
			this.fuerza += 6;
			System.out.println(nombre + " ha usado FURIA. Ahora su FUERZA es " + this.fuerza + 
					" y su VIDA es " + this.vida + " .");
		}
	}
	
	@Override
	boolean esquivar() {
		int num = 0;
		num = (int)(Math.random()*30)+3;
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
		defensor.vida = this.fuerza;
		System.out.println("Cagaste. Te quedan " + defensor.vida + " puntos de VIDA.");
	}
	
	@Override
	public String obtenerTipo() {
		return "Guerrero";
	}
}
