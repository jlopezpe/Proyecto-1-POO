public class Empresa {
    public int NIT;
    public int RUT;
    public String nombre;
    public String direccion;
    private static int capital=40000000;
    private static int costos=0;
    private static int ventas=0;
    public Empresa(int NIT,int RUT,String nombre,String direccion){
        this.NIT=NIT;
        this.RUT=RUT;
        this.direccion=direccion;
        this.nombre=nombre;
    }

    public static void getEmpleados(){

        for(Empleado n:Empleado.listaEmpleados){
            System.out.println(n.getId() + "     " + n.getNombre() + "     " + n.getCargo());
        }

    }

    public void crearEmpleado(String nom,String carg){

        Empleado.listaEmpleados.add(new Empleado(nom,carg));
    }

	public static int getCostos() {
		return costos;
	}

	public static int getVentas() {
		return ventas;
	}

	public static int getCapital() {
		return capital;
	}


}
