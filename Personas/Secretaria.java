package Personas;
import java.util.*;

import Procesos.*;

public class Secretaria {
    static ArrayList<Dulce> pedidoSec = new ArrayList<>();
    public static void tomarPedido(String tipo_dulce,int cantidad_dulces, Cliente cliente) {
    	
            if (tipo_dulce.equals("chocolate")) {
            	Factura factura=new Factura(tipo_dulce,cantidad_dulces,2000);
                if (verificarStock(tipo_dulce, cantidad_dulces) == false) {
                    Manufactura.CrearDulce(tipo_dulce);
                    borrarDulces(tipo_dulce,cantidad_dulces);
                    factura.generarCosto(tipo_dulce,cantidad_dulces,cliente);
                     Cso.setVentaChocolate(Cso.getVentaChocolate() + cantidad_dulces);
                    Empresa.setVentas(+cantidad_dulces*2000);

                } else {
                	
                    borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
                        factura.generarCosto(tipo_dulce,cantidad_dulces,cliente); Cso.setVentaChocolate(Cso.getVentaChocolate() + cantidad_dulces);
                        Cso.setVentaChocolate(Cso.getVentaChocolate() + cantidad_dulces);
                    Empresa.setVentas(+cantidad_dulces*2000);
                }
            }

            if (tipo_dulce.equals("gomitas")) {
            	Factura factura=new Factura(tipo_dulce,cantidad_dulces,300);
                if (Secretaria.verificarStock(tipo_dulce, cantidad_dulces) == false) {
                    Manufactura.CrearDulce(tipo_dulce);
                    borrarDulces(tipo_dulce,cantidad_dulces);
                    factura.generarCosto(tipo_dulce,cantidad_dulces,cliente);
                     Cso.setVentaGomitas(Cso.getVentaGomitas() + cantidad_dulces);
                    Empresa.setVentas(+cantidad_dulces*300);
                } else {
                	
                    borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
                    factura.generarCosto(tipo_dulce,cantidad_dulces,cliente);
                    Cso.setVentaGomitas(Cso.getVentaGomitas() + cantidad_dulces);
                    Empresa.setVentas(+cantidad_dulces*300);
                }

            }
            if (tipo_dulce.equals("caramelo")) {
            	Factura factura=new Factura(tipo_dulce,cantidad_dulces,200);
                if (Secretaria.verificarStock(tipo_dulce, cantidad_dulces) == false) {
                    Manufactura.CrearDulce(tipo_dulce);
                    borrarDulces(tipo_dulce,cantidad_dulces);
                    factura.generarCosto(tipo_dulce,cantidad_dulces,cliente);
                    Cso.setVentaCaramelos(Cso.getVentaCaramelos() + cantidad_dulces);
                    Empresa.setVentas(+cantidad_dulces*200);
                } else {
                	

                	borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
                    factura.generarCosto(tipo_dulce,cantidad_dulces,cliente);
                    Cso.setVentaCaramelos(Cso.getVentaCaramelos() + cantidad_dulces);
                    Empresa.setVentas(+cantidad_dulces*200);
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

        else if (tipo_dulce.equals("caramelo")) {
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
        if (dulce.equals("caramelo")) {
            for (int j = 0; j < cantidad; j++) {
                pedidoSec.add(Manufactura.Deposito_caramelos.get(j));
                Manufactura.Deposito_caramelos.remove(j);
            }
        }
        Repartidor.pedido = pedidoSec;
        pedidoSec.clear();
        
    }
}
