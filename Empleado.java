package Personas;
import java.util.*;
public class Empleado extends Persona {

    private int sueldo, empleadoNum, horas;
    private String cargo;
    private int id;
    private static int idSiguiente=0;


    public static ArrayList<Empleado> listaEmpleados=new ArrayList<>();
    Empleado(){
        id=idSiguiente;
        idSiguiente++;
    }
    Empleado(String nombre, int sueldo){
        this.setNombre(nombre);
        this.sueldo=sueldo;
        id=idSiguiente;
        listaEmpleados.add(this);
        idSiguiente++;
    }
    public Empleado(String nombre, String cargo) {
        this.setNombre(nombre);
        id=idSiguiente;
        this.cargo = cargo;
        listaEmpleados.add(this);
        idSiguiente++;
    }


    public static  Empleado getEmpleado(int i){
        return Empleado.listaEmpleados.get(i);
    }
    public int getId(){
        return id;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getEmpleadoNum() {
        return empleadoNum;
    }

    public void setEmpleadoNum(int empleadoNum) {
        this.empleadoNum = empleadoNum;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static int getIdSiguiente() {
        return idSiguiente;
    }
}
