
public class Proveedor extends Persona {
	
	int sueldo;
	
	
	Proveedor(int sueldo,String nombre,int id){
		super(nombre,id);
		this.sueldo=sueldo;
		this.nombre=nombre;
	}
	
	public void Suministrar() {
		
		Manufactura.Azucar=+80;
		Manufactura.Colorante=+80;
		Manufactura.Almidon=+80;
		Empresa.capital=-200000;
		Empresa.costos+=2000000;
		
		
	}
	
	

}
