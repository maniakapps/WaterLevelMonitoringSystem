package recipientes;

import java.util.Objects;

public class Tinaco extends Recipiente{

    public Tinaco(double capacidadLitros, double current) {
        super(capacidadLitros, current);
    }

    public Tinaco(double capacidad) {
        super(capacidad);
    }

    public Tinaco() {
        super();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipiente)) return false;
        Recipiente that = (Recipiente) o;
        return Double.compare(that.getCapacidadLitros(), getCapacidadLitros()) == 0 && Double.compare(that.getCurrent(), getCurrent()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacidadLitros(), getCurrent());
    }
}
