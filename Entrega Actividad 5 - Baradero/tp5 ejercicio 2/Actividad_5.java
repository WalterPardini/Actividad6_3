package actividad_5;

import java.util.LinkedList;
import java.util.Scanner;

public class Actividad_5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ColaDeTrabajo cola1 = new ColaDeTrabajo();
        Caso a = new Caso();
        int aux1;
        int estado;
        
        System.out.print("Inserte el nombre de la cola\n");
        cola1.nombre = leer.next();
        
        System.out.print("¿Desea insertar un trabajo?\n");
        System.out.print("1 = si / 2 = no\n");
        estado = leer.nextInt();
        
        while(estado == 1){
        
            System.out.println("Inserte el nombre del trabajo");
                cola1.trabajo = leer.next();
        
            System.out.print("¿Se encuentra lista?\n");
            System.out.print("1 = si se encuentra lista\n");
            System.out.print("2 = no se encuentra lista\n");
                
            aux1=leer.nextInt();

            if(aux1==1){
                cola1.lista=true;
            }
                
            cola1.aniadir(cola1.trabajo);
            
            System.out.print("opcion 1 = insertar\n");
            System.out.print("opcion 2 = retornar\n");
            
            estado = leer.nextInt();
        }
        
        
        
        try{
            a.NoListaExeption(cola1.nombre, cola1.contador, cola1.lista);
       
        }catch(ListaException e) {
            System.out.println(e.getMessage());
        }
        
        try{
            a.SinTrabajoEnColaException(cola1.nombre, cola1.contador);
        
        }catch(ListaException e) {
            System.out.println(e.getMessage());

        }
        
        cola1.mostrar();
    } 
    
}