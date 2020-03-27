
package Personas;

import Procesos.Empresa;
public class Cso extends Empleado {
    private static int ventaChocolate;
    private static int ventaGomitas;
    private static int ventaCaramelos;
    public Cso(String nombre,int sueldo){
        super(nombre,sueldo);
    }
    public static int ganancias() {

        int resultado=Empresa.getVentas()-Empresa.getCostos();

        if(resultado<0) {
            return resultado;
        }
        else {
            return Empresa.getVentas()-Empresa.getCostos();
        }

    }

    public static void asignarSueldo(Empleado emp) {
        if (Empresa.getCapital() > 20000000) {
            emp.setSueldo(960000);
        } else if (Empresa.getCapital() < 20000000) {
            emp.setSueldo(700000);
        }
    }

   
    public static String repartidorMes() {
        Repartidor a=(Repartidor) Empleado.getEmpleado(3);
        Repartidor b=(Repartidor) Empleado.getEmpleado(4);
        if(a.puntosTrabajo==b.puntosTrabajo) {
            return "Los dos han trabajado por igual,nadie recibe aumento";
        }
        else if(a.puntosTrabajo>b.puntosTrabajo) {
            if(checkUp()) {
                a.setSueldo(a.getSueldo()+100000);
                return "El repartidor: "+a.getNombre()+"ha recibido un aumento";
            }
            else {
                return "No se ha podido hacer el aumento,el capital va en bajada";
            }
        }
        else if(b.puntosTrabajo>a.puntosTrabajo) {
            if(checkUp()) {
                b.setSueldo(b.getSueldo()+100000);
                return "El repartidor: "+b.getNombre()+"ha recibido un aumento";
            }
            else {
                return "No se ha podido hacer el aumento,el capital va en bajada";
            }
        }
        return "fin";
    }
    public static boolean checkUp() {
        if(Empresa.getCapital()>15000000) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String mayorVenta() {
        String mensaje="";
        if(getVentaChocolate()>getVentaGomitas() && getVentaChocolate()>getVentaCaramelos()) {
            mensaje="Chocolate";
        }
        else if(getVentaGomitas()>getVentaChocolate() && getVentaGomitas()>getVentaCaramelos()) {
            mensaje="Gomitas";
        }
        else if(getVentaCaramelos()>getVentaChocolate() && getVentaCaramelos()>getVentaGomitas()) {
            mensaje="Caramelos";
        }
        return mensaje;
    }

    public static String unidades_mayorVenta(){
        String mensaje2="";
        if(getVentaChocolate()>getVentaGomitas() && getVentaChocolate()>getVentaCaramelos()) {
            mensaje2=String.valueOf(getVentaChocolate()/2);
        }
        else if(getVentaGomitas()>getVentaChocolate() && getVentaGomitas()>getVentaCaramelos()) {
            mensaje2=String.valueOf(getVentaGomitas()/2);
        }
        else if(getVentaCaramelos()>getVentaChocolate() && getVentaCaramelos()>getVentaGomitas()) {
            mensaje2=String.valueOf(getVentaCaramelos()/2);

        }
        return mensaje2;
    }

    public static int getVentaChocolate() {
        return ventaChocolate;
    }

    public static void setVentaChocolate(int ventaChocolate) {
        Cso.ventaChocolate = ventaChocolate;
    }

    public static int getVentaGomitas() {
        return ventaGomitas;
    }

    public static void setVentaGomitas(int ventaGomitas) {
        Cso.ventaGomitas = ventaGomitas;
    }

    public static int getVentaCaramelos() {
        return ventaCaramelos;
    }

    public static void setVentaCaramelos(int ventaCaramelos) {
        Cso.ventaCaramelos = ventaCaramelos;
    }
}
