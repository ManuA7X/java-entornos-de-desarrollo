package parte2;

public class E2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
        Realiza un programa que genere 20 números aleatorios entre 1 y 10 (ambos incluidos) y que los
muestre por pantalla. A continuación, el programa deberá mostrar el número de ocurrencias de cada
número. Puedes usar tantos arrays auxiliares como estimes oportuno
        */
        
        int [] array = new int [20];
        int [] contador = new int [10];
        
        //poner numeros aleatorios
        
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10)+1;
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        //recorre el primer array
        
        for(int i=0;i<array.length;i++){
        
            //recorre el segundo array
            
            for(int j=0;j<contador.length;j++){
             
                //si el numero del primer array es igual a la posicion del array, se suma un 1 a esa posicion
                
                if(array[i]==j+1){
                    contador[j]++;
                }
            }
        }
        
        //se imprime el segundo array con la cantidad de numeros que tiene
        
        for(int i=0;i<contador.length;i++){
            System.out.println("El " + (i+1) + " aparece " + contador[i] + " veces");
        }
	}

}
