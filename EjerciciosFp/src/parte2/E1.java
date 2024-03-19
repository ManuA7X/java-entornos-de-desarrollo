package parte2;

public class E1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		 /*
        Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
(ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá mostrar por
separado los múltiplos de 2, de 3 y de 5
        */
        
        int [] array = new int [20];
        
        //numeros aleatorios
        
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100)+1;
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        //pasa por todo el array y calcula cuantos son pares
        
        System.out.print("Multiplos de 2: ");
        
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
            }
        }
        
        System.out.println("");
        
        //igual para multiplos 3
        
        System.out.print("Multiplos de 3: ");
        
        for(int i=0;i<array.length;i++){
            if(array[i]%3==0){
                System.out.print(array[i] + " ");
            }
        }
        
        System.out.println("");
        
        //igual para multiplos de 5
        
        System.out.print("Multiplos de 5: ");
        
        for(int i=0;i<array.length;i++){
            if(array[i]%5==0){
                System.out.print(array[i] + " ");
            }
        }
        
        System.out.println("");
	}

}
