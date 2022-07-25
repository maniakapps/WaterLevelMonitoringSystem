import boards.BoardAntar;
import org.jetbrains.annotations.Contract;


import java.util.Scanner;

public class Sistema {
    private int state;
    private final BoardAntar tarjeta;
    private final Scanner scanner;

    public Sistema() {
        tarjeta = createAntarBoard();
        state = 0;
        scanner = new Scanner(System.in);
    }

    @Contract(" -> new")
    private BoardAntar  createAntarBoard(){
        return new BoardAntar();
    }


    public void iniciar(){
        try {
            state = 1;
            tarjeta.encender();
            mostrarMenu();
            int opcion = scanner.nextInt();
            seleccion(opcion);

        }catch(Exception e){
            System.out.println("Ha surgido un error mientras se intentaba iniciar el sistema.");
        }

    }
    public void apagar(){
        state = 1;
        tarjeta.apagar();
        System.out.println("Apagado");
    }
    public int getEstado() {
        return state;
    }


    public BoardAntar getTarjeta() {
        return tarjeta;
    }
    private void mostrarMenu(){
        System.out.println("Seleccione una opción: ");
        System.out.println("1.- Mostrar puertos disponibles.");
        System.out.println("2.- Insertar sensor.");
        System.out.println("3.-");
        System.out.println("4.-");
    }

    private void seleccion(int opcion){
        if (opcion == 1) {
            tarjeta.mostrarPuertos();
        }
    }
}
