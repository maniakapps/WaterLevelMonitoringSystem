package boards;

import sensors.Sensor;

import java.util.HashMap;

public class BoardAntar extends Board {
    final int PORTS = 5;
    public BoardAntar(){
        puertos =  new HashMap<>(PORTS);
        name = "Antar V 1.0"; apagar();
    }
    @Override
    public void encender(){
        try {
            System.out.println("Tarjeta "+ name + " encendida y funcionando correctamente.");
            state = 1;
        }catch(Exception e){
            System.out.println("Ha surgido un error mientras se intentaba iniciar la tarjeta.");
        }
    }
    @Override
    public void apagar(){
        try {
            state=0;
        } catch (Exception e) {
            System.out.println("Ha surgido un error mientras se intentaba apagar la tarjeta.");
            e.printStackTrace();
        }
    }

    @Override
    public void seleccionarPuerto() {

    }

    @Override
    public int mostrarPuertos() {

        if(puertos.isEmpty()){System.out.println("Ningun puerto ocupado 1-5 disponibles"); return 0;}

        int i = 1;
        for(int key: puertos.keySet()) {
            System.out.print("Puerto " + i );
            if (key>=0){
                System.out.print(" ocupado");
            }else{
                System.out.print(" desocupado");
            }
            i++;
            if(i>=5){
                i = 1;
            }
        }
        return 0;
    }

    @Override
    public int insertarSensor(int puerto, Sensor sensor) {
        try {
            puertos.put(1, sensor);
            return 0;
        }catch (Exception e){
            return 1;
        }
    }

    @Override
    public int removerSensor(int puerto) {
        return 0;
    }

    @Override
    public void asignarPuerto() {

    }

    @Override
    public int getEstado() {
        return state;
    }
}
