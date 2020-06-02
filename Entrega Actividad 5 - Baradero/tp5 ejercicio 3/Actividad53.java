package actividad.pkg5.pkg3;

import java.util.Scanner;

public class Actividad53 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        DataBag datos = new DataBag();
        int estado = 0;
        int iniciar =0;
        Caso a = new Caso();

        System.out.print("¿Desea iniciar el programa?\n");
        System.out.print("1 = si / 2 = no\n");
        iniciar = leer.nextInt();

        
        while(iniciar==1){
            
        System.out.print("¿Desea insertar o eliminar un objeto?\n");
        System.out.print("1 = insertar / 2 = eliminar\n");
        estado = leer.nextInt();
        
            while(estado==1){
        
                System.out.print("Inserte su objeto\n");
                datos.objeto = leer.next();
        
                try{
                    
                    a.FullDataBagException(datos.i);
                    datos.aniadir(datos.objeto);
            
                }catch(DataBagException e){
                    System.out.println(e.getMessage());
                }
                

            
                System.out.print("¿Desea insertar un objeto?\n" + "Quedan: "+ (10-datos.i)+" espacios disponibles\n" );
                System.out.print("1 = si / 2 = no\n");
                estado = leer.nextInt();
            
            }
        
            while(estado==2){
            
                try{
                    
                    a.EmptyDataBagException(datos.i);
                    datos.remove();
                    datos.i--;
                
                }catch(DataBagException e){
                    System.out.println(e.getMessage());
                }
                
 
                
                System.out.print("¿Desea insertar o eliminar un objeto?\n");
                System.out.print("1 = insertar / 2 = eliminar\n");
                estado = leer.nextInt();
            }
        }
    }
    
}
