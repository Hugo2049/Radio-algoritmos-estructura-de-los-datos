import java.util.Scanner;

/**
 * La clase `Main` contiene el método principal que simula la interacción con el radio a través de la consola.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tablero tablero = new Tablero();
        CarRadio carRadio = new CarRadio(tablero);
        

        System.out.println("Bienvenido al Simulador de Radio");

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Prende el radio");
            System.out.println("2. Cambia de AM a FM a AM");
            System.out.println("3. Avanzar en el dial de las emisoras");
            System.out.println("4. Permite guardar una emisora en uno de los 12 botones");
            System.out.println("5. Permite seleccionar la emisora puesta en un botón");
            System.out.println("6. Apagar el radio");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            // opciones de la interfaz cuando el usuario interactue con el menu
            switch (opcion) {
                case 1:
                    carRadio.encender();
                    tablero.mostrarMensaje("Radio encendido.");
                    break;
                case 2:
                    carRadio.cambiarBanda();
                    tablero.mostrarMensaje("Cambiando de AM a FM a AM.");
                    break;
                case 3:
                    carRadio.subirEmisora();
                    tablero.mostrarMensaje("Avanzando en el dial de las emisoras.");
                    break;
                case 4:
                    System.out.print("Ingrese el número del botón (1-12) para guardar la emisora: ");
                    int numeroBotonGuardar = scanner.nextInt();
                    carRadio.guardarEmisoraEnBoton(numeroBotonGuardar);
                    tablero.mostrarMensaje("Emisora guardada en el botón " + numeroBotonGuardar + ".");
                    break;
                case 5:
                    System.out.print("Ingrese el número del botón (1-12) para seleccionar la emisora: ");
                    int numeroBotonSeleccionar = scanner.nextInt();
                    carRadio.seleccionarEmisoraEnBoton(numeroBotonSeleccionar);
                    tablero.mostrarMensaje("Emisora seleccionada desde el botón " + numeroBotonSeleccionar + ".");
                    break;
                case 6:
                    carRadio.apagar();
                    tablero.mostrarMensaje("Radio apagado.");
                    break;
                case 7:
                    tablero.mostrarMensaje("Saliendo del simulador de radio. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    tablero.mostrarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
            }

            // Mostrar estado actual del radio
            tablero.mostrarMensaje("Estado actual del radio:");
            tablero.mostrarMensaje("Encendido: " + carRadio.getEncendido());
            tablero.mostrarMensaje("Volumen: " + carRadio.getVolumen());
            tablero.mostrarMensaje("Emisora AM: " + carRadio.getEmisoraAM());
            tablero.mostrarMensaje("Emisora FM: " + carRadio.getEmisoraFM());
        }
    }
}