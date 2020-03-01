package colorBox;
public class Cso extends Empleado{
	public int ganancias(){
		return Empresa.capital;
	}
	public void asignarSueldo(Empleado emp) {
		if(Empresa.capital>20000000) {
			emp.sueldo=960000;
		}
		else if (Empresa.capital<20000000) {
			despedir();
			emp.sueldo=700000;
		}
	}
	public void despedir() {
		int x=(int) ((Math.random() * ((Empleado.idSiguiente - 2) + 1)) + 2);
		Empleado y=Empleado.getEmpleado(x);
		y=null;
	}
}