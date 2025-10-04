public abstract class Procesos{
    private int PID;
    private String nombre;

    public Procesos(int PID, String nombre){
        this.PID = PID;
        this.nombre = nombre;
    }

    public int getPID(){
        return PID;
    }
    public void setPID(int PID){
        this.PID = PID;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract void ejecutarse(){
        System.out.println("Proceso Ejecutandose");
    }
    
    @Override
    public String toString(){
        return "PID: " + PID + ", Nombre: " + nombre + "Tipo: " + this.getClass().getSimpleName();// getClass().getSimpleName() devuelve el nombre de la clase
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Procesos)) return false;//Si obk no es subclase de Procesos es false
        Procesos otro = (Procesos) obj;//Conversión de obj a tipo Procesos
        return this.PID == otro.PID;//Si los PID son iguales
    }
    
}