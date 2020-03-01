public class Repartidor extends Empleado{
    public static int idRepar;
    public String placa;
    public static int max=5;
    ArrayList<Dulce> pedido= new ArrayList<>();
    int numPedidos=pedido.size();
    
    Repartidor(String nombre,String plac,String cargo){
        id=idRepar;
        this.nombre=nombre;
        this.cargo=cargo;
        placa=plac;
        idRepar++;
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
    //faltaria un metodo repartir o algo asi que lo envie a cliente
}
