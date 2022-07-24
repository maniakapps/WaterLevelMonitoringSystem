package recipientes;

import java.util.Objects;

public abstract class Recipiente {
    protected double capacidadLitros;
    protected double current;

    public Recipiente(double capacidadLitros, double current) {
        this.capacidadLitros = capacidadLitros;
        this.current = current;
    }

    public Recipiente(double capacidad) {
    }

    public Recipiente() {

    }

    public double getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(double capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }


}
