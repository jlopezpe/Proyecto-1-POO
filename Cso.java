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
     public static String repartidorMes() {
	 Repartidor a=(Repartidor) Empleado.getEmpleado(3);
	 Repartidor b=(Repartidor) Empleado.getEmpleado(4);
	  if(a.puntosTrabajo==b.puntosTrabajo) {
		  return "Los dos han trabajado por igual,nadie recibe aumento";
	  }
	  else if(a.puntosTrabajo>b.puntosTrabajo) {
		  if(checkUp()) {
			  a.sueldo+=100000;
			  return "El repartidor: "+a.nombre+"ha recibido un aumento";
		  }
		  else {
			  return "No se ha podido hacer el aumento,el capital va en bajada";
		  }
	  }
	  else if(b.puntosTrabajo>a.puntosTrabajo) {
		  if(checkUp()) {
			  b.sueldo+=100000;
			  return "El repartidor: "+b.nombre+"ha recibido un aumento";
		  }
		  else {
			  return "No se ha podido hacer el aumento,el capital va en bajada";
		  }
	  }
	  return "fin";
  }
  public static boolean checkUp() {
	  if(Empresa.capital>15000000) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
}
