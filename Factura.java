
package Test;


public class Factura{
	public String tipo_dulce;
	private int cantidad;
	private int precio;
	private int precio_unidad=0;
	public int precio_total=0;
	
	public Factura() {}
	public Factura(String tipo,int cantidad,int precio) {
		tipo_dulce=tipo;
		this.cantidad=cantidad;
		this.precio=precio;
	}
    public void generarCosto(String tipo,int cantidad, Cliente cliente){
        int precio1=0;
        if(tipo.equals("chocolate")){
            precio1+=2000*cantidad;
            precio_unidad=2000;
        }else if(tipo.equals("gomitas")){
            precio1+=300*cantidad;
            precio_unidad=300;
        }else if(tipo.equals("confites")){
            precio1+=200*cantidad;
            precio_unidad=200;
        }
        precio_total+=precio1;
        generarFactura(tipo,cantidad,cliente,precio1);
    }
    public void generarFactura(String tipo, int dulce, Cliente cliente, int precio){
    	cliente.miFactura.add(new Factura(tipo,cantidad,precio));
    	}
    public String toString() {
    	return "Tipo: "+tipo_dulce+ " Cantidad: "+cantidad+" Precio unidad: "+precio_unidad+" Precio por "+cantidad+ "unidades: "+precio;
    }
		
}

