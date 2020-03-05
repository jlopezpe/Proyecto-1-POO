
package Test;


public class Factura {
    String tipo=Manufacturera.tipo_dulce;
    
    public String codigo;
    public int generarCosto(String tipo){
        int precio=0;
        if(tipo.equals("chocolate")){
            precio+=2000*Dulce.cantidad;
        }else if(tipo.equals("gomitas")){
            precio+=300*Dulce.cantidad;
        }else if(tipo.equals("confites")){
            precio+=200*Dulce.cantidad;
        }
        
        return precio;
    }
    public String generarFactura(){
        if(
        
    }
}
