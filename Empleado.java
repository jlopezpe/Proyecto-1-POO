package Personas;
import java.util.*;
public class Empleado extends Persona {

    public int sueldo, empleadoNum, horas;
    public String cargo;
    public int id;
    public static int idSiguiente=0;
    
    
    public static ArrayList<Empleado> listaEmpleados=new ArrayList<>();
    Empleado(){
        id=idSiguiente;
        idSiguiente++;
    }
    Empleado(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo=sueldo;
        id=idSiguiente;
        listaEmpleados.add(this);
        idSiguiente++;
    }
    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        id=idSiguiente;
        this.cargo = cargo;
        listaEmpleados.add(this);
        idSiguiente++;
    }
    public int getId(){
        return id;
    }
    
    public static  Empleado getEmpleado(int i){
        return Empleado.listaEmpleados.get(i);
    }    
}