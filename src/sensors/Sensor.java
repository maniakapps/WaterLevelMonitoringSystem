package sensors;
import java.io.*;

public abstract class Sensor implements Closeable
{
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void getData();
    public abstract double randomData(int start, int end);
    public abstract void close();
    protected String nombreSensor;
    protected Tipo tipo;
    protected int random;
    protected int estado;
    public String getNombreSensor() {
        return nombreSensor;
    }

    public void setNombreSensor(String nombreSensor) {
        this.nombreSensor = nombreSensor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}

