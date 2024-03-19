import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		
		/*Realiza un programa que pinte por pantalla un cuadrado a base de asteriscos con borde doble. El
usuario deberá introducir la longitud del lado del cuadrado que deberá ser mayor o igual a 5.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la longitud del cuadrado (>=5): ");
		
        int borde = sc.nextInt();
        
        System.out.println(" ");
        
        //el bucle tendra la longitud que se ha introducido dibujando una figura MxM
        for(int i =0;i<borde;i++){
            for(int j =0;j<borde;j++){
                
            	//el bucle imprime (*) las 2 de arriba y las 2 de abajo
                if(i<2||i>borde-3){
                    System.out.print("*");
                 
                //el bucle imprime (*) las de la izq y las de la der dejando un espacio en medio
                }   else {
                        if(j<2||j>borde-3){
                            System.out.print("*");
                        } else{
                            System.out.print(" ");
                        }
                    }
                }
            System.out.println("");
        }
	}

}
