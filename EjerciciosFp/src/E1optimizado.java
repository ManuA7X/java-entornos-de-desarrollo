import java.util.Scanner;

public class E1optimizado {

	public static void main(String[] args) {
		/*
        La compañía automovilística Ñesla nos ha encargado un configurador para calcular el precio de su
coche eléctrico. Los dos modelos que tiene a la venta son el Ñesla Modelo 5 y el Ñesla Modelo 8,
que tienen un precio base de 30.000 € y 36.000 € respectivamente. El Modelo 5 se puede encargar
con batería de 50 kWh o de 70 kWh mientras que el modelo 8 se puede pedir con 80 kWh o con 120
kWh. En todos los casos, cada kWh de batería se paga a 125 €. El Modelo 8 (solo este modelo) se
puede encargar con el paquete de conducción autónoma, que cuesta 1800 €. Todos los coches
eléctricos cuentan con una subvención del gobierno del 5% del precio final del vehículo. No hay que
considerar el IVA, ya está incluido en todas las tarifas.
        */
        
        int Mod5 = 30000;
        char bat;
        int Mod8 = 36000;
        char modelo;
        int preciocoche;
        double descuento;
        double preciofinal;
        char autonomo = 'n';
        int precioautonomo = 0;
        int kWh = 125;
        int bat50 = 50;
        int bat70 = 70;
        int bat80 = 80;
        int bat120 = 120;
        int bateriafinal;
        String coche;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8");
        
        modelo = sc.next().charAt(0);
        
        //pide  el modelo de coche y se mete en el if o en el else
        
        if(modelo=='a'){
            coche = "Modelo 5";
            
            //se pone el precio al modelo
            
            preciocoche = Mod5;
            
            System.out.println("Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh");
            
            //se pide bateria e iguala a los batios correspondientes
            
            bat = sc.next().charAt(0);
            
            if (bat=='a'){
                bateriafinal = bat50;
            } else {
                bateriafinal = bat70;
            }
            
        } else {
            coche = "Modelo 8";
            
            preciocoche = Mod8;
            
            System.out.println("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh");
            
            bat = sc.next().charAt(0);
            
            if (bat=='a'){
                bateriafinal = bat80;
            } else {
                bateriafinal = bat120;
            }
            
            System.out.println("¿Quiere el paquete de conducción autónoma? (s/n)");
            
            //se pide si es autonomo y se añade al precio
            
            autonomo = sc.next().charAt(0);
            
            if(autonomo=='s'){
                precioautonomo = 1800;
            }
            
            
        }
        
        //aqui se pone el precio total con el precio del coche, el tipo de bateria y se calcula con el precio por vatio
        
        System.out.println("Gracias aqui tiene su presupuesto");
        
        System.out.println("Tesla modelo: " + coche +"\n" +
                            "Precio base: " + preciocoche + "\n" +
                            "Bateria de " + bateriafinal + "kWh" + bateriafinal * kWh);
        
        //si el modelo es 8 y se pide el autonomo se imprime el primero
        //si es modelo 8 pero no se pide se imprime el segundo
        
        if ("Modelo 8".equals(coche)&&autonomo=='s'){
            System.out.println("Con conduccion automatica " + precioautonomo);
        }else if ("Modelo 8".equals(coche)&&autonomo!='s') {
            System.out.println("Sin conduccion automatica " + precioautonomo);
        }
        
        //calculo de precio final y descuento
        
        preciofinal = preciocoche + (bateriafinal*kWh) + precioautonomo;
        descuento = preciofinal*0.05;
        
        System.out.println("Subvencion estatal: " + descuento);
        
        System.out.println("Total: " + (preciofinal - descuento));

	}

}
