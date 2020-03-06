import java.util.*;
public class ManufacturaF {
	
	static int Azucar=600;
	static int Colorante=600;
	static int Almidon=600;
	
	public static ArrayList<Dulce> Deposito_caramelos= new ArrayList<Dulce>();
	public static ArrayList<Dulce> Deposito_chocolate= new ArrayList<Dulce>();
	public static ArrayList<Dulce> Deposito_gomitas= new ArrayList<Dulce>();
  
	public static void crearDulce(String tipo) {
		
		if(Azucar<100 || Almidon<100 || Colorante<100) {
			Secretaria.llamarProveedor();
			if(tipo.equals("chocolate") {
				Deposito_chocolate.add(new Dulce("chocolate"));
				Azucar=-300;
				Almidon=-200;
        }
        if(tipo.equals("caramelo") {
				Deposito_caramelos.add(new Dulce("caramelo"));
				Colorante=-250;
				Azucar=-350;
				Almidon=-150;
        }
        if(tipo.equals("gomitas") {
				Deposito_gomitas.add(new Dulce("gomitas"));
				Colorante=-200;
				Azucar=-350;
				Almidon=-150;
        }
			}		
		}
}
