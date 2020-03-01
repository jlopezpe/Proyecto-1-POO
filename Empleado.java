
package Test;
import java.util.*;
public class Empleado extends Persona {

    public int sueldo, empleadoNum, horas;
    String cargo;
    public static int idSiguiente;
    public ArrayList<Empleado> listaEmpleados=new ArrayList<>();

    Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        id=idSiguiente;
        this.cargo = cargo;
        listaEmpleados.add(this);
        idSiguiente++;
    }
    
    Empleado[] listaConvertida=new Empleado[listaEmpleados.size()];
    
    listaConvertida=listaEmpleados.toArray(listaConvertida);//este es el error
    public String getEmpleado(int f){
        return "Empleado número: " + listaEmpleados.get(f).id + " Nombre: " + listaEmpleados.get(f).nombre + " Cargo: " + listaEmpleados.get(f).cargo;
                
    }
    
    public static long getId(){
        return idSiguiente;
    }
    
    
    
}
