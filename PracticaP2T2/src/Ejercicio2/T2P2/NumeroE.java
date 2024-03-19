package Ejercicio2.T2P2;



public class NumeroE {
    int numero;
    
    public NumeroE(int num){
    	try {
    		if(num<0) {
    			this.numero+=0;
    			throw new NumeroError("El numero debe ser positivo");
    			
    		}else if(num == 0 || num>0){
    			this.numero = num;
    		}
    	}catch (NumeroError e) {
    		System.out.println(e.getMessage());
    	}catch (NumberFormatException nfe) {
    		System.out.println("Sólo números enteros");
    	}
    	
    }
    
    public int getNumero(){
    	if(this.numero<0) {
    		return this.numero = 0;
    	}else{
        return this.numero;
    	}
    }
    
    public void setNumero(int nuevo){
        this.numero = nuevo;
    }
    
    public String toString(){
        return this.numero+"";
    }
}
