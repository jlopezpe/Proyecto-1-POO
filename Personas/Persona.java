package Personas;
public class Persona {
    private String nombre;
    private long id;
    Persona(){}
    Persona(String nombre){
        this.nombre=nombre;
    }
    Persona(long id,String nombre){
        this(nombre);
        this.id=id;
    }
	public String getNombre() {
		return nombre;
	}
}
