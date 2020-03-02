package Test;
import java.util.*;

public class Repartidor extends Empleado{
    public static int idRepar;
    public String placa;
    public static int max=5;
    ArrayList<Dulce> pedido= new ArrayList<>();
    int numPedidos=pedido.size();
    
    Repartidor(String nombre,String cargo,String placa){
        super(nombre,cargo);
        this.placa=placa;
    }
    public void pedido(Dulce algo){
        if(this.disponibilidad(idRepar)==true){
            pedido.add(algo); 
        }
        else{
            System.out.println("no hay Repartidores disponibles, por favo intentelo más tarde");
        }
               
    }
    public boolean disponibilidad(int repa1){
        for (int i=0;i<numPedidos;i++){
            if (i<max){
                return true;
            }
            else{
                return(false);
            }
        }
        return false;
    }
}

