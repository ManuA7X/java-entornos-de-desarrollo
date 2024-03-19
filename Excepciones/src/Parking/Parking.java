package Parking;

public class Parking {

	String[] matriculas;
	String nombre;
	int plaza;

	public Parking(String nombre, int plaza) {
		this.nombre = nombre;
		matriculas = new String[plaza];
	}

	public String getNombre() {
		return nombre;
	}

	public void entrada(String nuevaMatricula, int plaza) {
		try {
			boolean coincide = false;
			if (nuevaMatricula==null || nuevaMatricula.isBlank()) {
				throw new Error("Matrícula vacía");
			}
			for(int i=0; i<matriculas.length;i++) {
				if(matriculas[i]==null) {
					
				}else if(matriculas[i].equalsIgnoreCase(nuevaMatricula)) {
					coincide = true;
				}
			}
			
			if (nuevaMatricula.replaceAll("\\s", "").toCharArray().length<4) {
				throw new Error("La matrícula " + nuevaMatricula + " es demasiado corta");
			}else if(matriculas[plaza-1]!=null) {
				throw new Error("La plaza " + plaza + " está ocupada");
			}else if(coincide) {
				throw new Error("La matrícula " + nuevaMatricula + " ya está en uso");
			}
			matriculas[plaza-1]=nuevaMatricula;
			
		}catch (Error e) {
			System.out.println(e.getMessage());
			
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Esa plaza no existe");
		}
	}
	
	public int salida(String matricula) {
		int a = 0;
		try {
			for(int i=0;i<matriculas.length;i++) {
				if(matriculas[i]==null) {
					
				}else if(matriculas[i].equalsIgnoreCase(matricula)) {
					matriculas[i]=null;
					a=i;
					System.out.println("La matrícula " + matricula + " ha dejado la plaza " + (a+1));
				}
			}
		
		}catch (Exception e) {
		System.out.println(e.getMessage());
		}
		return a;
	}
	
	public int getPlazasTotales() {
		return plaza;
	}
	
	public int getPlazasOcupadas() {
		return plaza;
	}
	
	public int getPlazasLibres() {
		return plaza;
	}

	@Override
	public String toString() {
		String toString="";
		toString+="Parking " +nombre+":\n-----------------\n";
		for(int i=0; i<matriculas.length;i++) {
			if(matriculas[i]==null) {
				toString+="Plaza " + (i+1) + ": vacia.\n";
			}else {
				toString+="Plaza " + (i+1) + ": " + matriculas[i] + "\n";
			}
		}
		return toString;
	}
	
}
