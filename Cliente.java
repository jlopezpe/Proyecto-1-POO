package Personas;
import Procesos.Factura;
import java.util.*;

import Excepciones.cincuentaMas;
import Excepciones.dulceEquivocado;
public class Cliente extends Persona{
	
	private long cel;
    private String Direccion;
    public Cliente(String nombre, long cel, String direccion){
        super(nombre);
        this.cel=cel;
        Direccion=direccion;
    }
	public ArrayList<Factura> miFactura=new ArrayList<>();
	public void hacerPedido(String tipo_dulce,int cantidad_dulce) {
		Secretaria.tomarPedido(tipo_dulce, cantidad_dulce,this);
	} 
	public static void verificarTipo(String cantidad) throws dulceEquivocado{
		if(!cantidad.equals("chocolate") && !cantidad.equals("gomitas") && !cantidad.contentEquals("caramelos")) {
			throw new dulceEquivocado(cantidad);
		}
		
	}
	public static void verificarCantidad(int cantidad) throws cincuentaMas{
		if(cantidad>50) {
			throw new cincuentaMas(cantidad);
		}
	}
	public void mostrarFactura() {
		for(int i=0;i<miFactura.size();i++) {
			System.out.println(miFactura.get(i));
		}
	}
	public long getCel() {
        return cel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setCel(long cel) {
        this.cel = cel;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
