import java.util.*;

public class Cliente extends Persona {

    long celular;
    String direccion;
    
    public Cliente(String nombre,String direccion,long celular){
        super(nombre);
        this.direccion=direccion;
        this.celular=celular;
    }

    public void hacerPedido(String tipo_dulce, int cantidad_dulce) {

        Secretaria.tomarPedido(tipo_dulce, cantidad_dulce);//ejecutar metodo de secretaria tomarpedido()
    }
}

