package Personas;
import Procesos.Empresa;
import Procesos.Manufactura;

public class Proveedor extends Persona {
	Proveedor(String nombre){
		super(nombre);
	}
	
	public static  void Suministrar() {
		Manufactura.Azucar+=100;
		Manufactura.Colorante+=100;
		Manufactura.Almidon+=100;
		Empresa.capital-=5000000;
	}
}
