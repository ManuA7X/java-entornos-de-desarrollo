package parte2;

public class E3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
        Si hay algo típico y entrañable en la época navideña es el nacimiento con La Virgen María, El Niño
Jesús y San José. Realiza un programa que pinte por pantalla un nacimiento teniendo en cuenta las
siguientes premisas:
a) El portal es siempre el mismo, no varía en anchura ni en altura ni en los caracteres que se
pintan (guiones y asteriscos). Debe salir exactamente igual a como se indica en los ejemplos.
b) La Virgen María se representa con una V, San José con una S y el Niño Jesús con una o
minúscula.
c) Los tres personajes deben aparecer colocados de forma aleatoria en la misma línea, apoyados
en el suelo (no pueden levitar), en alguna de las 5 posiciones posibles.
d) Cada uno de los personajes debe aparecer en una posición distinta (no se pueden superponer).
e) El Niño Jesús siempre debe aparecer en medio de La Virgen y de San José. Sin embargo, tanto
La Virgen como San José pueden aparecer a la derecha o a la izquierda del Niño Jesús.
        */
        
        
        System.out.println("*******");
        System.out.println("*     *");
        
        char [] problema = new char [7];
        
        for(int i=0;i<problema.length;i++){
            problema[i] = ' ';
        }
        
        char nino = 'o';
        char maria = 'V';
        char jose = 'S';
        int posicionnino = 0;
        int posicionmaria = 0;
        int posicionjose = 0;
        
        //posicion aleatoria para el niño entre las 3 centrales para dejar espacio a maria y jose
        
        posicionnino = (int)(Math.random()*3+2);
        
        problema[posicionnino]=nino;
        
        //se pone a maria en una posicion aleatoria mientras ente vacia la posicion
        
        do {
            posicionmaria = (int)(Math.random()*5+1);
        } while (problema[posicionmaria]!=' ');
        
        problema[posicionmaria]=maria;
        
        //se pone a jose
        
        if(posicionnino>posicionmaria){
        
            //si el niño esta por encima de maria se da una posicion aleatoria a jose
            //solo es valida si esa posicion esta vacia y jose esta por encima del niño (maria esta debajo ddel niño)
            
            do {
                posicionjose = (int)(Math.random()*5+1);
            } while (problema[posicionjose]!=' '||posicionjose<posicionnino);  
            
            problema[posicionjose] = jose;
            
        } else {
        
            //si maria esta por encima del niño
            //solo es valida si esa posicion esta vacia y jose esta por debajo del niño (maria esta por encima del nño)
            
            do {
                posicionjose = (int)(Math.random()*5+1);
            } while (problema[posicionjose]!=' '||posicionjose>posicionnino);  
            
            problema[posicionjose] = jose;
        }
        
        problema[0]='*';
        problema[6]='*';
        
        System.out.println(problema);
        System.out.println("-------");
	}

}
