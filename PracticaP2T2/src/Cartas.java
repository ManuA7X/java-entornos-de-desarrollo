
public class Cartas {
	
	    private String nombre;
	    private int estado;
	    
	    public Cartas (){
	        this.estado = estado;
	    }

	    public int getEstado (){
	       int num = (int) (Math.random() * 2);
	       this.estado = num;
	       return this.estado;
	    }
}


