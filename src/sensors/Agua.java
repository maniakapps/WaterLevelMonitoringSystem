package sensors;

import sensors.types.Analogico;
import sensors.types.Tipo;

public class Agua extends Sensor {

    public Agua(int id, String name, String modelo){
        turnOn();
        random = 0;
        nombreSensor = name;
        tipo = new Analogico(id, modelo);
    }
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
    @Override
    public void turnOn() {
        estado = 1;
    }

    @Override
    public void turnOff() {
        estado = 0;
    }

    @Override
    public void getData() {
        System.out.println(randomData(0, 100));
    }

    @Override
    public double randomData(int start, int end) {
        return Math.random()*(end-start+1)+start;
    }

    @Override
    public void close() {

    }
}
