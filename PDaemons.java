public class PDaemons extends Procesos{
    public PDaemons(int PID, String nombre){
        super(PID, nombre); 
    }

    @Override
    public void ejecutarse(){
        System.out.println("El proceso: "+getNombre()+ "esta ejecutando tareas en segundo plano");
    }
    
}