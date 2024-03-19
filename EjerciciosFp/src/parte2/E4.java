package parte2;

import java.util.Arrays;
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
        programa que pida el dia de la semana
        dar de forma aleatoria pautas segun:
        1. empieza con bici, eliptica o cinta
        2. musculo grande y musculo pequeño
        grande: espalda pecho piernas
        pequeñas: biceps triceps hombros
        3. abdominales o (bici, eliptica, cinta)
        si es aerobico no puede ser igual que el 1.
        4. miercoles y domingo nada
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el dia de la semana");
        
        String dia = sc.next();
        int num = 0;
        
        //todos los posibles entrenamientos
        
        String[] cardio = new String []{"bici", "eliptica", "cinta", "abdominales"};
        String[] grande = new String[] {"espalda", "pecho", "piernas"};
        String [] pequeno = new String[] {"biceps", "triceps", "hombros"};
        
        //si es dia de descanso acaba
        
        if("miercoles".equals(dia)||"domingo".equals(dia)){
            System.out.println("Dia de descanso");
        } else{
            
            //se crea un string para todo el entrenamiento
            
            String[] entrenamiento = new String[4];
            
            //se da valores con aleatorios
            
            num = (int)(Math.random()*3);
            
            entrenamiento[0] = cardio[num];
            
            num = (int)(Math.random()*3);
            
            entrenamiento[1] = grande[num];
            
            num = (int)(Math.random()*3);
            
            entrenamiento[2] = pequeno[num];

            //se da un valor aleatoro al ultimo, si es 3 es abdominales, si es otro, y se ha repetido antes, se vuelve a calcular el aleatorio
            
            do {
                num = (int)(Math.random()*4);
            
                //num = 3;
                
                entrenamiento[3] = cardio[num];
                
            } while (entrenamiento[3]==entrenamiento[0]);
        
            System.out.println("Su entrenamiento de hoy es: " + Arrays.toString(entrenamiento));
        }
	}

}
