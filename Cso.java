package Test;
import java.util.*;
public class Cso extends Empleado {

    public int ganancias() {
        return Empresa.capital-Empresa.costos;
    }

    public void asignarSueldo(Empleado emp) {
        if (Empresa.capital > 20000000) {
            emp.sueldo = 960000;
        } else if (Empresa.capital < 20000000) {
            despedir();
            emp.sueldo = 700000;
        }
    }
    
    public void despedir(){
        int x=(int) ((Math.random() * ((Empleado.idSiguiente - 2) + 1)) + 2);
        Empleado.listaEmpleados.remove(x);
    }
}
