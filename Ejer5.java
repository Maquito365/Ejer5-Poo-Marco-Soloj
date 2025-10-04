import java.util.Scanner;
public class Ejer5{
    public static void main(String[]args){
        ControladorProcesos controlador = new ControladorProcesos();
        Scanner scanner = new Scanner(System.in);

        controlador.registrar(1, "Compilador", "CPU");
        controlador.registrar(2, "Impresora", "Entrada/Salida");
        controlador.registrar(3, "Antivirus", "Servicio");
        controlador.registrar(4, "Navegador", "Red");
        controlador.registrar(5, "Actualizador", "Daemons");

        boolean salir = false;
        while(!salir){
            System.out.println("\nMenu de Procesos:");
            System.out.println("1. Listar Procesos");
            System.out.println("2. Ejecutar todos los procesos");
            System.out.println("3. Agregar nuevo proceso");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    for(Procesos proceso : controlador.getListaProcesos()){
                        System.out.println(proceso);
                    }
                    break;
                case 2:
                    controlador.ejecutarTodosProcesos();
                    break;
                case 3:
                    System.out.print("Ingrese PID: ");
                    int PID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese nombre del proceso: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese tipo de proceso (CPU, Entrada/Salida, Servicio, Red, Daemon): ");
                    String tipo = scanner.nextLine();
                    controlador.registrarProceso(PID, nombre, tipo);
                    System.out.println("Proceso agregado exitosamente.");
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}