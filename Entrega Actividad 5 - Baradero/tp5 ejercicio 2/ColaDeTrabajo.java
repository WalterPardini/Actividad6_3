package actividad_5;

import java.util.Collection;
import java.util.LinkedList;

public class ColaDeTrabajo implements Trabajo{
    
    String nombre;
    long contador;
    String trabajo;
    boolean lista = false;
    
    LinkedList cola = new LinkedList();

    
    @Override
    public void aniadir(String t) {
        t=trabajo;
        cola.addFirst(t);
        contador++;
        
    }

    @Override
    public void mostrar() {
        System.out.println(cola);
    }
  
}  
