package colorBox;
public class Proveedor extends Persona {

	
	Proveedor(String nombre){
		
		this.nombre=nombre;
	}
	
	public static  void Suministrar() {
		
		Manufactura.Azucar=+50;
		Manufactura.Colorante=+50;
		Manufactura.Almidon=+50;
		Empresa.capital=-5000;
		
		
	}
	
	

}