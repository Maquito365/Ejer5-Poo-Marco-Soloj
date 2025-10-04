public class PServicio extends Procesos{
    public PServicio(int PID, String nombre){
        super(PID, nombre); 
    }

    @Override
    public void ejecutarse(){
        System.out.println("El proceso: "+getNombre()+ "esta ejecutando tareas de servicio");
    }
}