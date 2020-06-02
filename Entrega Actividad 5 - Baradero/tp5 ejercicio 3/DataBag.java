package actividad.pkg5.pkg3;

import java.util.LinkedList;

public class DataBag {
    
    Object objeto = new Object();
    int i = 0;
    LinkedList cola = new LinkedList();

    public void aniadir(Object t) {
    t=objeto;
    cola.addFirst(t);
    i++;
    }
    
    public Object remove(){
        return(Object)cola.removeLast();
    }
    
}
