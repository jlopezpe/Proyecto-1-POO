
package Test;
import java.util.*;

public class Empresa {
    public int NIT;
    public int RUT;
    public String nombre;
    public String direccion;
    public Empresa(int NIT,int RUT,String nombre,String direccion){
        this.NIT=NIT;
        this.RUT=RUT;
        this.direccion=direccion;
        this.nombre=nombre;
    }
    
    public void getEmpleados(){
        for (int i = 0; i < Empleado.getId()-1; i++) {
             //Aqui llama al metodo get empleado..no se asusten...Como está no va a dejar pero
             //cuando se arregla el error de conversion desde ese metodo se llama es al array y se pondría el método estatico....
        }
    }

    
}
