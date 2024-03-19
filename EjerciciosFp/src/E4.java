import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		
		/*Los números “donut” son los que tienen un 0 justo en la posición central, en caso de que el número de
		cifras sea impar; o bien, los que tienen dos ceros en las posiciones centrales, en caso de que el
		número de dígitos sea par. El resto de dígitos pueden ser ceros o no, no se tienen en cuenta. Por
		ejemplo, los números 23037, 1008, 9060044, 0 y 8000 son “números donut”. Sin embargo 6758, 8903,
		4200, 1234 y 7 no lo son. Realiza un programa que diga si un número introducido por teclado es un
		“número donut” o no.*/

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo");
        
        int num = sc.nextInt();
        
        //esto calcula cuantos digitos tiene el numero (703 = 3) (5248 = 4)
        
        int longitud = String.valueOf(num).length();
        
        //esto hace un string del numero dado
        
        String numero = Integer.toString(num);
        
        if(longitud%2==0){
            //estos son pares
            
            //calcular las posiciones longitud/2 y longitud/2-1
            
            //si los 2 son ceros, es donut
        	
        	/*verifica si el carácter en la mitad de la cadena "numero" es '0' y 
        	si el carácter justo antes de la mitad de la cadena también es '0'. Si ambas condiciones son verdaderas, 
        	el bloque de código asociado al "if" se ejecutará.*/
            
            if(numero.charAt(longitud/2)=='0'&&numero.charAt(longitud/2-1)=='0'){
                System.out.println("El numero " + numero + " es donut");
            } else {
                System.out.println("El numero " + numero + " no es donut");
            }
            
        } else{
            //estos son impares
            
            //si el del medio es 0 es donut
            
            if(numero.charAt(longitud/2)=='0'){
                System.out.println("El numero " + numero + " es donut");
            } else{
                System.out.println("El numero " + numero + " no es donut");
            }   
        }
	}

}
