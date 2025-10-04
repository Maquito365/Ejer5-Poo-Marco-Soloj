public class ProcesosCPU extends Procesos{
    public CPUProcesos(int PID, String nombre){
        super(PID, nombre); //Super llama al constructor de la clase padre
    }

    @Override
    public void ejecutarse(){
        System.out.println("El proceso: "+getNombre()+ "esta ejecutando tareas dentro de la CPU");
    }
}