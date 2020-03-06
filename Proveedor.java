package Personas;

import Procesos.Empresa;
import Procesos.Manufactura;

public class Proveedor extends Persona {

	
	Proveedor(String nombre){
		
		this.nombre=nombre;
	}
	
	public static  void Suministrar() {
		
		Manufactura.Azucar=+500;
		Manufactura.Colorante=+500;
		Manufactura.Almidon=+500;
		Empresa.capital=-500000;
		
		
	}
	
	

}
