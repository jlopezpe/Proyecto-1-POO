
package Test;




public class Factura{
	public String tipo_dulce;
	private int cantidad;
	private int precio;
	private int precio_total=0;
	public Factura(String tipo,int cantidad,int precio) {
		tipo_dulce=tipo;
		cantidad=cantidad;
		this.precio=precio;
	}
    public void generarCosto(String tipo,int cantidad, Cliente cliente){
        int precio1=0;
        if(tipo.equals("chocolate")){
            precio1+=2000*cantidad;
        }else if(tipo.equals("gomitas")){
            precio1+=300*cantidad;
        }else if(tipo.equals("confites")){
            precio1+=200*cantidad;
        }
        precio_total+=precio1;
        generarFactura(tipo,cantidad,cliente,precio1);
    }
    public void generarFactura(String tipo, int dulce, Cliente cliente, int precio){
    	cliente.miFactura.add(new Factura(tipo,cantidad,precio,precio_total));
    	}
		
}
