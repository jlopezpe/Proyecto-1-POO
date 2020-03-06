package Personas;
import java.util.*;

import Procesos.Factura;
public class Cliente extends Persona{
	
	long cel;
	String Direccion;
	public Cliente(String nombre, long cel, String direccion){
		super(nombre);
		this.cel=cel;
		Direccion=direccion;
	}
	public ArrayList<Factura> miFactura=new ArrayList<>();
	public void hacerPedido(String tipo_dulce,int cantidad_dulce) {
		Secretaria.tomarPedido(tipo_dulce, cantidad_dulce,this);
	} 
	public void mostrarFactura() {
		for(int i=0;i<miFactura.size();i++) {
			System.out.println(miFactura.get(i));
		}
	}
}