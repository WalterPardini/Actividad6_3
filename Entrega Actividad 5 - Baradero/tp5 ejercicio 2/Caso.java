
package actividad_5;

public class Caso {
    
    Caso(){
        
    }
    
    public void NoListaExeption(String nom, long s, boolean lis) throws ListaException{
        if(lis==false){
            throw new ListaException("La Cola de Trabajo: "+ nom + " no está disponible. Cantidad de trabajos procesar: " + s);
        }
    }
    
    public void SinTrabajoEnColaException(String nom, long s) throws ListaException{
        if(s==0){
            throw new ListaException("La cola "+nom+" no tiene trabajos para procesar");
        }
    }
     
}
