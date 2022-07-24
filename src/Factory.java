import herramientas.Llave;
import recipientes.Tinaco;

public class Factory {
    public Llave crearLlave(){
        return new Llave();
    }
    public Llave crearLlave(double flujo){
        return new Llave(flujo);
    }

    public Tinaco crearTinaco(double capacidad){
        return new Tinaco(capacidad);
    }
    public void crearTinaco(){
        new Tinaco();
    }
}
