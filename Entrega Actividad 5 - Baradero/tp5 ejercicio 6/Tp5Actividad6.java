package tp5.actividad.pkg6;

import java.util.Scanner;

public class Tp5Actividad6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Circulo a = new Circulo();
        
        System.out.print("incerte el radio de su circulo\n");
        
        a.setRadio(leer.nextDouble());
        
        System.out.print("El Area de su circulo es:  " + a.Area(a.getRadio()) + "\n");
        
        System.out.print("La Longitud de su circulo es:  " + a.Longitud(a.getRadio()) + "\n");


    }
    
}

/** a_ No seria posible.

    b_ Porque se obtiene al dividir la longitud de una circunferencia entre la longitud 
       de su diámetro lo que daria un numero con infinitos decimales, imposible de almacenar 
**/