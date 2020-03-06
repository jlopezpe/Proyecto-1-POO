package colorBox;
public class Persona {
    public String nombre;
    public long id;
    Persona(){}
    Persona(String nombre){
        this.nombre=nombre;
    }
    Persona(long id,String nombre){
        this.nombre=nombre;
        this.id=id;
    }
}
