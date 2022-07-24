package herramientas;

public class Llave {
    private double flujoPorHora;

    public Llave(double flujoPorHora) {
        setFlujoPorHora(flujoPorHora);

    }

    public Llave() {
        setFlujoPorHora(0);
    }

    public double getFlujoPorHora() {
        return flujoPorHora;
    }

    public void setFlujoPorHora(double flujoPorHora) {
        this.flujoPorHora = flujoPorHora;
    }

    public double abrir(){
        return getFlujoPorHora();
    }
    public void cerrar(){
        setFlujoPorHora(0);
    }
}
