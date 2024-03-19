import java.util.Arrays;

public class Amigos {

	private Persona[]personas;
	
	public Amigos(Persona[]personas) {
		this.personas = personas;
	}
	
	public Persona[]mayoresQue(int edad){
		Persona[]nueva = new Persona[personas.length];
		int i = 0;
		for(Persona p : personas) {
			if(p.getEdad() >= edad){
				nueva[i] = p;
				i++;
			}
		}
		return Arrays.copyOf(nueva, i);
	}
	
	public Persona[]menoresQue(int edad){
		Persona[]nueva = new Persona[personas.length];
		int i = 0;
		for(Persona p : personas) {
			if(p.getEdad() <= edad){
				nueva[i] = p;
				i++;
			}
		}
		return Arrays.copyOf(nueva, i);
	}
	
	public Persona[]empiezaCon(String s){
		Persona[]nueva = new Persona[personas.length];
		int i = 0;
		for(Persona p : personas) {
			if(p.getNombre().startsWith(s)){
				nueva[i] = p;
				i++;
			}
		}
		return Arrays.copyOf(nueva, i);
	}
	
	public String toString() {
		return Arrays.toString(personas);
	}
}
