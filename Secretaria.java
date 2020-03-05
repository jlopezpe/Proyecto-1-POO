import java.util.*;

public class Secretaria {

    static ArrayList<Dulce> pedidoSec = new ArrayList<>();
    public String tipo;
    public static void tomarPedido(String tipo_dulce,int cantidad_dulces) {
        tipo=tipo_dulce;
            if (tipo_dulce.equals("chocolate")) {

                if (verificarStock(tipo_dulce, cantidad_dulces) == false) {

                    Manufactura.CrearDulce();
                    borrarDulces(tipo_dulce,cantidad_dulces);

                } else {

                        borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 

                }
            }

            if (tipo_dulce.equals("gomitas")) {
                if (Secretaria.verificarStock(tipo_dulce, cantidad_dulces) == false) {
                    Manufactura.CrearDulce();
                    borrarDulces(tipo_dulce,cantidad_dulces);

                } else {

                	borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
                }

            }

            if (tipo_dulce.equals("confites")) {

                if (Secretaria.verificarStock(tipo_dulce, cantidad_dulces) == false) {

                    Manufactura.CrearDulce();
                    borrarDulces(tipo_dulce,cantidad_dulces);

                } else {

                	borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
                }

            }

        }

    private static boolean verificarStock(String tipo_dulce, int cantidad_dulces) {
    	boolean x=false;
        if (tipo_dulce.equals("chocolate")) {
            int tamaño_deposito = Manufactura.Deposito_chocolate.size();

            if (tamaño_deposito < cantidad_dulces) {

                x= false;

            } else {
            	x=true;
            }
        }

        else if (tipo_dulce.equals("gomitas")) {
            int tamaño_deposito = Manufactura.Deposito_gomitas.size();

            if (tamaño_deposito < cantidad_dulces) {

            	 x= false;

            } else {
            	x=true;
            }

        }

        else if (tipo_dulce.equals("confites")) {
            int tamaño_deposito = Manufactura.Deposito_caramelos.size();

            if (tamaño_deposito < cantidad_dulces) {

            	 x= false;

            } else {
                x=true;
            }

        }
        return x;
    }

    public static void llamarProveedor() {

        Proveedor.Suministrar();
    }

    public  static void borrarDulces(String dulce, int cantidad) {
        if (dulce.equals("chocolate")) {
            for (int j = 0; j < cantidad; j++) {
                pedidoSec.add(Manufactura.Deposito_chocolate.get(j));
                Manufactura.Deposito_chocolate.remove(j);
            }
        }
        if (dulce.equals("gomitas")) {
            
            for (int j = 0; j < cantidad; j++) {
                pedidoSec.add(Manufactura.Deposito_gomitas.get(j));
                Manufactura.Deposito_gomitas.remove(j);
            }
        }
        if (dulce.equals("caramelos")) {
            for (int j = 0; j < cantidad; j++) {
                pedidoSec.add(Manufactura.Deposito_caramelos.get(j));
                Manufactura.Deposito_caramelos.remove(j);
            }
        }
        Repartidor.pedido = pedidoSec;
        pedidoSec.clear();
        
    }
}
