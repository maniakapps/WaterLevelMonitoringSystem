package boards;

import sensors.Sensor;

public class BoatdTwo extends Board{


    @Override
    public void encender() {
        state=1;
    }

    @Override
    public void apagar() {
        state = 0;
    }

    @Override
    public void seleccionarPuerto() {

    }

    @Override
    public void asignarPuerto() {

    }

    @Override
    public int mostrarPuertos() {
        return 0;
    }

    @Override
    public int insertarSensor(int puerto, Sensor sensor) {
        return 0;
    }

    @Override
    public int removerSensor(int puerto) {
        return 0;
    }

    @Override
    public int getEstado() {
        return state;
    }
}
