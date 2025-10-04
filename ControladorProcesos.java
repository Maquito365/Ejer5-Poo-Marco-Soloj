import java.util.ArrayList;
import java.util.List;
public class ControladorProcesos{
    private List<Procesos> listaProcesos;

    public ControladorProcesos(){
        listaProcesos = new ArrayList<>();
    }

    public void agregarProceso(Procesos proceso){
        if(!listaProcesos.contains(proceso)){ // Verifica si el proceso ya existe en la lista
            listaProcesos.add(proceso);
        } else {
            System.out.println("El proceso ya existe en la lista.");
        }
    }

    public void registrar(int PID, String nombre){
        switch(nombre.toLowerCase()){
            case "cpu":
                registrar(new ProcesosCPU(PID, nombre));
                break;
            case "entrada/salida":
                registrar(new PEntradaSalida(PID, nombre));
                break;
            case "daemons":
                registrar(new PDaemons(PID, nombre));
                break;
            case "network":
                registrar(new PNetwork(PID, nombre));
                break;
            case "servicio":
                registrar(new PServicio(PID, nombre));
                break;
            default:
                System.out.println("Tipo de proceso no reconocido.");
        }
    }

    public List<Procesos> getListaProcesos(){
        return listaProcesos;
    }

    public void ejecutarTodosProcesos(){
        for(Procesos proceso : listaProcesos){
            proceso.ejecutarse();
        }
    }
}