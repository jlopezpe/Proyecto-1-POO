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
      public String repartidorMes(Repartidor a,Repartidor b) {
	  if(a.puntosTrabajo==b.puntosTrabajo) {
		  return "Los dos han trabajado por igual,nadie recibe aumento";
	  }
	  else if(a.puntosTrabajo>b.puntosTrabajo) {
		  if(checkUp(a)) {
			  a.sueldo+=100000;
			  return "El repartidor: "+a.nombre+"ha recibido un aumento";
		  }
		  else {
			  return "No se ha podido hacer el aumento,el capital va en bajada";
		  }
	  }
	  else if(b.puntosTrabajo>a.puntosTrabajo) {
		  if(checkUp(b)) {
			  b.sueldo+=100000;
			  return "El repartidor: "+b.nombre+"ha recibido un aumento";
		  }
		  else {
			  return "No se ha podido hacer el aumento,el capital va en bajada";
		  }
	  }
	  return "fin";
  }
  public boolean checkUp(Repartidor a) {
	  if(Empresa.capital>15000000) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
}
