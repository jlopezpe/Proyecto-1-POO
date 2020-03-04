package Test;
import java.util.*;
public class Empleado extends Persona {

    public int sueldo, empleadoNum, horas;
    String cargo;
    public static int idSiguiente=0;
    
    public static ArrayList<Empleado> listaEmpleados=new ArrayList<>();
    
    Empleado(String nombre){
        super(idSiguiente,nombre);
        idSiguiente++;
    }
    Empleado(String nombre, String cargo) {
    	super(idSiguiente,nombre);
        this.cargo = cargo;
        listaEmpleados.add(this);
        idSiguiente++;
    }
    
    public Empleado getEmpleado(int i){
        return Empleado.listaEmpleados.get(i);
    }
   
}  
