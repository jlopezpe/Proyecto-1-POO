
public class Proveedor extends Persona {
	
	int sueldo;
	
	
	Proveedor(int sueldo,String nombre){
		
		this.sueldo=sueldo;
		this.nombre=nombre;
	}
	
	public void Suministrar() {
		
		Manufacturera.Azucar=+80;
		Manufacturera.Colorante=+80;
		Manufacturera.Almidon=+80;
		Empresa.capital=-200000;
		Empresa.costos+=2000000;
		
		
	}
	
	

}
