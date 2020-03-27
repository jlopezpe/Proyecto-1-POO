package Personas;
import Procesos.Factura;
import java.util.*;

import Excepciones.cincuentaMas;
import Excepciones.dulceEquivocado;
public class Cliente extends Persona{
	
	private String cel;
    private String Direccion;
    public Cliente(String nombre, String cel, String direccion){
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
	public String mostrarFactura() {
        	String msg1="";
        	for(int i=0;i<miFactura.size();i++) {
            		msg1+=(miFactura.get(i) + "\n");
        	}
        
        return msg1;
    	}
	public String getCel() {
        return cel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
