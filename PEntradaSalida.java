public class PEntradaSalida extends Procesos{
    public PEntradaSalida(int PID, String nombre){
        super(PID, nombre);
    }

    @Override
    public void ejecutarse(){
        System.out.println("El proceso: "+getNombre()+ "esta ejecutando tareas de Entrada/Salida");
    }

}