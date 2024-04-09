package util;

public abstract class Algoritmos {
	
	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el sumatorio
	 * @return			el sumatorio del numero especificado
	 */
	public static int sumatorio(int numero) {
		int suma = 0;
		
		for (int i = 1; i <= numero; i++) {
            suma += i;
        }
		
		return suma;
	}
	
	/**
	 * Devuelve el factorial del numero especificado
	 * 
	 * @param numero	el numero que vamos a factorizar
	 * @return			el factorial del numero especificado
	 */
	public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
