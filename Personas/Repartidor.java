package Personas;
import java.util.*;
import Procesos.*;
public class Repartidor extends Empleado{

    public static int idRepar;
    public String placa;
    public static int max=5;
    public static ArrayList<Dulce> pedido= new ArrayList<>();
    int numPedidos=pedido.size();
    public int puntosTrabajo;
    
 public Repartidor(String nombre,String cargo,String placa){
        super(nombre,cargo);
        this.placa=placa;
    }
public void Repartir(Cliente a) {
    this.puntosTrabajo+=1;
        if(this.disponibilidad()==true) {

           // a.pedido_cliente=this.pedido;
            pedido.clear();
        }
}

    public boolean disponibilidad(){
        if(numPedidos!=0){
            //System.out.println("no hay Repartidores disponibles, por favor intentelo más tarde");
            return false;
        }
        else{
            return true;
        }
    }
}