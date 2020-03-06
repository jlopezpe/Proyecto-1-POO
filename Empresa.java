package Test;
import java.util.*;

public class Empresa {
    public int NIT;
    public int RUT;
    public String nombre;
    public String direccion;
    public static int capital=40000000;
    public static int costos=0;
    public static int ventas=0;
    public Empresa(int NIT,int RUT,String nombre,String direccion){
        this.NIT=NIT;
        this.RUT=RUT;
        this.direccion=direccion;
        this.nombre=nombre;
    }
    
    public static void getEmpleados(){//Cambiar para q los impriman una clase :)
        
        for(Empleado n:Empleado.listaEmpleados){
            System.out.println(n.getId() + "     " + n.nombre + "     " + n.cargo);
        }
        
    }
    
    public void crearEmpleado(String nom,String carg){
        
        Empleado.listaEmpleados.add(new Empleado(nom,carg));
    }

    
}
