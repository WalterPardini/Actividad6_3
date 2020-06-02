
package actividad_4_a;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad_4_A {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Double suma = 0.0;
        int i=0;
        ArrayList<String> producto = new ArrayList();
        ArrayList<Double> precio = new ArrayList();
        
        System.out.println("Ingrese su producto o ingrese 'total' para finalizar la operacion"); 
        producto.add(leer.next());
        while(!"total".equals(producto.get(i))){
  
            System.out.println("Ingrese su Valor");
            precio.add(leer.nextDouble());
            suma = suma + precio.get(i);
            System.out.println("Ingrese su producto o ingrese 'total' para finalizar la operacion"); 
            producto.add(leer.next());
            
        i++;
            
        }
        System.out.println("Sus productos son: " + producto);
        System.out.println("Y su valor total es: "+ suma);

    }

    
}
