package Test;
import java.util.*;
public class Empleado extends Persona {

    public int sueldo, empleadoNum, horas;
    String cargo;
    private final int id;
    public static int idSiguiente=0;
    
    public static ArrayList<Empleado> listaEmpleados=new ArrayList<>();
    
    Empleado(){
        id=idSiguiente;
        idSiguiente++;
    }
    Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        id=idSiguiente;
        this.cargo = cargo;
        listaEmpleados.add(this);
        idSiguiente++;
    }
    public int getId(){
        return id;
    }
    
    public Empleado getEmpleado(int i){
        return Empleado.listaEmpleados.get(i);
    }
   
    
    
    
}
