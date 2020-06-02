package actividad.pkg5.pkg3;

public class Caso {
    Caso(){
        
    }
    
    public void FullDataBagException(int i) throws DataBagException{
        if(i==10){
            throw new DataBagException("La bolsa de datos esta llena");
        }
    }
    
    public void EmptyDataBagException(int i) throws DataBagException{
        if(i==0){
            throw new DataBagException("La bolsa de datos esta vacia");
        }
    }
}
