package tp5.actividad.pkg6;

public class Circulo {
    private Double pi = 3.14;
    private Double radio;
    
    public void setRadio (Double rad){
        this.radio = rad;
    }
    public Double getRadio(){
        return this.radio;
    }
    
    public Double Area(Double rad){
        Double area = pi*rad*rad;
        return area;
    }
    
    public Double Longitud(Double rad){
        Double longitud = pi*rad*2;
        return longitud;
    }
    
}
