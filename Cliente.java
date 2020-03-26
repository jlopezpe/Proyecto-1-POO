package Personas;

import Procesos.Factura;
import java.util.*;
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
