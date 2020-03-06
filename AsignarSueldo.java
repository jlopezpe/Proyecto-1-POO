import java.util.Scanner;

public class AsignarSueldo extends OpcionDeMenu{
public void ejecutar(){
    Scanner input= new Scanner(System.in);
    System.out.println("Ingrese el nombre del trabajador ");
    String nombre=input.next();
    System.out.println("Ingrese el cargo ");
    String cargo=input.next();
    Empleado x=new Empleado(nombre,cargo);
    Cso.asignarSueldo(x);
    System.out.println("El sueldo asignado a "+x.nombre+" fue "+x.sueldo);
} 
}