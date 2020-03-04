import java.util.*;
public class Manufactura {
	
	static int Azucar=100;
	static int Colorante=100;
	static int Almidon=100;
	
	public static ArrayList<Dulce> Deposito_caramelos= new ArrayList<Dulce>();;
	public static ArrayList<Dulce> Deposito_chocolate= new ArrayList<Dulce>();;
	public static ArrayList<Dulce> Deposito_gomitas= new ArrayList<Dulce>();;
	
	
	public static void CrearDulce() {
		
		if(Azucar<30 || Almidon<30 || Colorante<30) {
			
			int i;
			
			Secretaria.llamarProveedor(p);
			for(i=0;i<80;i++) {
				
				Deposito_caramelos.add(new Dulce("chocolate"));
				Azucar=-6;
				Almidon=-4;
				Deposito_caramelos.add(new Dulce("caramelo"));
				Colorante=-5;
				Azucar=-7;
				Almidon=-3;
				Deposito_caramelos.add(new Dulce("gomitas"));
				Colorante=-5;
				Azucar=-7;
				Almidon=-3;
				
			}
					
		}
		else {
			int i;
			for(i=0;i<80;i++) {
				
				if(Azucar>6 && Almidon>4) {
					Deposito_caramelos.add(new Dulce("chocolate"));
					Azucar=-6;
					Almidon=-4;
				}
				else {
					Secretaria.llamarProveedor(p);
					Deposito_caramelos.add(new Dulce("chocolate"));
					Azucar=-6;
					Almidon=-4;
				}
				if(Colorante>5 && Azucar>7 && Almidon>3) {
					Deposito_caramelos.add(new Dulce("caramelo"));
					Colorante=-5;
					Azucar=-7;
					Almidon=-3;
				}
				else {
					Secretaria.llamarProveedor(p);
					Deposito_caramelos.add(new Dulce("caramelo"));
					Colorante=-5;
					Azucar=-7;
					Almidon=-3;
				}
				if(Colorante>5 && Azucar>7 && Almidon>3) {
					Deposito_caramelos.add(new Dulce("gomitas"));
					Colorante=-5;
					Azucar=-7;
					Almidon=-3;
				}
				else {
					Secretaria.llamarProveedor(p);
					Colorante=-5;
					Azucar=-7;
					Almidon=-3;
				}
			}
		}
		
	}
}
					