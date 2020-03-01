
public class Proveedor extends Persona {
	
	int sueldo;
	
	
	Proveedor(int sueldo,String nombre){
		
		this.sueldo=sueldo;
		this.nombre=nombre;
	}
	
	public void Suministrar() {
		
		Manufacturera.Azucar=+50;
		Manufacturera.Colorante=+50;
		Manufacturera.Almidon=+50;
		Empresa.capital=-5000;
		
		
	}
	
	

}
