package boards;

import sensors.Sensor;

import java.util.HashMap;

public abstract class Board {
   protected int state;
   protected String name;
   protected HashMap<Integer, Sensor> puertos;
   public abstract void encender();
   public abstract void apagar();
   public abstract void seleccionarPuerto();
   public abstract void asignarPuerto();
   public abstract int mostrarPuertos();
   public abstract int insertarSensor(int puerto, Sensor sensor);
   public abstract int removerSensor(int puerto);
   public abstract int getEstado();
}
