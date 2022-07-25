package herramientas;

import recipientes.Recipiente;

public class Llave {
    private double flujoPorHora;

    public Llave(double flujoPorHora) {
        setFlujoPorHora(flujoPorHora);

    }

    public void llenar(Recipiente rec){
        while(true){
            if(rec.getCurrent()>= rec.getCapacidadLitros()){
                System.out.println("Se ha llenado");
                break;
            }
            rec.setCurrent(rec.getCurrent() + flujoPorHora/60);
        }
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
