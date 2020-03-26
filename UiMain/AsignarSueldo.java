package UiMain;
import java.util.Scanner;
import Personas.Cso;
import Personas.Empleado;
public class AsignarSueldo extends OpcionDeMenu{
public String ejecutar(){
    Scanner input= new Scanner(System.in);
    System.out.println("Ingrese el nombre del trabajador ");
    String nombre=input.next();
    System.out.println("Ingrese el cargo ");
    String cargo=input.next();
    Empleado x=new Empleado(nombre,cargo);
    Cso.asignarSueldo(x);
    return("El sueldo asignado a "+x.nombre+" fue "+x.sueldo);
} 
public String ejecutar1(String nombre,String cargo){
	   // Scanner input= new Scanner(System.in);
	   // System.out.println("Ingrese el nombre del trabajador ");
	   // String nombre=input.next();
	   // System.out.println("Ingrese el cargo ");
	   // String cargo=input.next();
	    Empleado x=new Empleado(nombre,cargo);
	    Cso.asignarSueldo(x);
	    System.out.println("El sueldo asignado a "+x.nombre+" fue "+x.sueldo+" pesos");
	    return "El sueldo asignado a "+x.nombre+" fue "+x.sueldo+" pesos";
	}
	}
