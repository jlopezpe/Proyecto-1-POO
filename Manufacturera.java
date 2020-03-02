import java.util.*;
public class Manufactura {
	
	static int Azucar=15;
	static int Colorante=15;
	static int Almidon=15;
	
	private static ArrayList<Dulce> Deposito_gomitas= new ArrayList<Dulce>();;
	private static ArrayList<Dulce> Deposito_chocolate= new ArrayList<Dulce>();;
	private static ArrayList<Dulce> Deposito_confites= new ArrayList<Dulce>();;
	
	
	public static void CrearDulce() {
		
		
		int i;
		String tipo_dulce;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Que tipo de dulce desea?");
		tipo_dulce = input.next();
		
		int cantidad_dulce=input.nextInt();
		
		
		
		if(tipo_dulce.equals("chocolate")){
			
			System.out.println("Que chocolate quiere?"+"  "+"Escriba el número");
			
			String a="Kitkat";
			String b="Crunch";
			String c="Snicker";
			
			
			System.out.println("1) "+a);
			System.out.println("2) "+b);
			System.out.println("3) "+c);
			
			int tipo_chocolate=input.nextInt();
			
			if(tipo_chocolate==1) {
				
				if(Azucar<5 || Almidon<4) {
					
					//llamar al metodo de secretaria para que llame al proveedor
					
					for(i=0;i<cantidad_dulce;i++) {
					
						Deposito_chocolate.add(new Dulce(a));
						Azucar=Azucar-4;
						Almidon=Almidon-3;
					
					}

				}
				else {
					
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_chocolate.add(new Dulce(a));
						Azucar=Azucar-4;
						Almidon=Almidon-3;
					
					}
				}
			
										
			}
			
			if(tipo_chocolate==2) {
				
				if(Almidon<3 || Azucar<5) {
					
					//llamar al metodo de secretaria para que llame al proveedor
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_chocolate.add(new Dulce(b));
						Almidon=Almidon-2;
						Azucar=Azucar-4;
					
					}
				}
				
				else {
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_chocolate.add(new Dulce(b));
						Almidon=Almidon-2;
						Azucar=Azucar-4;
					
					}

				}
			}
			
			if(tipo_chocolate==3) {
				
				if(Colorante<4 || Azucar<5) {
					
					//llamar al metodo de secretaria para que llame al proveedor
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_chocolate.add(new Dulce(c));
						Colorante=Colorante-3;
						Azucar=Azucar-4;
					
					}
				}
				
				else {
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_chocolate.add(new Dulce(c));
						Colorante=Colorante-3;
						Azucar=Azucar-4;
					
					}
				}
			}		
		}
		
		if(tipo_dulce.equals("gomitas")){
			
			System.out.println("Que gomitas quiere?"+"  "+"Escriba el número");
			
			String a="Haribo";
			String b="Trululu";
			String c="Grissly";
			
			
			System.out.println("1) "+a);
			System.out.println("2) "+b);
			System.out.println("3) "+c);
			
			int tipo_gomita=input.nextInt();
			
			if(tipo_gomita==1) {
				
				if( Azucar<6 || Colorante<5) {
					
					//llamar al metodo de secretaria para que llame al proveedor
					
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_gomitas.add(new Dulce(a));
						Colorante=Colorante-4;
						Azucar=Azucar-5;
				
					}
								
				}
				else {
				
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_chocolate.add(new Dulce(a));
						Colorante=Colorante-4;
						Azucar=Azucar-5;
					
					}
				}
										
			}
			
			if(tipo_gomita==2) {
				
				if(Azucar<6 || Almidon<7) {
					
					//llamar al metodo de secretaria para que llame al proveedor
					
					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_gomitas.add(new Dulce(b));
						Azucar=Azucar-5;
						Almidon=Almidon-6;
					}
				}
					
				else {

					for(i=0;i<cantidad_dulce;i++) {
						
						Deposito_gomitas.add(new Dulce(b));
						Azucar=Azucar-5;
						Almidon=Almidon-6;
					}
				}
			}
			
			
			
			if(tipo_gomita==3) {
				
				if(Azucar<4 || Colorante<6) {
					
					//llamar al metodo de secretaria para que llame al proveedor
					
					for(i=0;i<cantidad_dulce;i++) {
						
					
						Deposito_gomitas.add(new Dulce(c));		
						Azucar=Azucar-3;
						Colorante=Colorante-5;
					}
					
				}
				
				else {
					
					for(i=0;i<cantidad_dulce;i++) {
						
						
						Deposito_gomitas.add(new Dulce(c));		
						Azucar=Azucar-3;
						Colorante=Colorante-5;
					}
				}
			}
		}
			
		if(tipo_dulce.equals("confites")){
				
			System.out.println("Que confites quiere?"+"  "+"Escriba el número");
				
			String a="Smarties";
			String b="Nikolo";
			String c="Jolly Rancher";
				
				
			System.out.println("1) "+a);
			System.out.println("2) "+b);
			System.out.println("3) "+c);
			
			
			int tipo_confite=input.nextInt();
			
			if(tipo_confite==1) {
				
				if(Azucar<2 || Colorante<3) {
					
					//llamar a secretaria para que utilice el metodo de llamar al proveedor
					
					for(i=0;i<cantidad_dulce;i++) {
						Deposito_confites.add(new Dulce(a));
						Azucar=-1;
						Colorante=-2;
					}
					
					
				}
				else {
					for(i=0;i<cantidad_dulce;i++) {
						Deposito_confites.add(new Dulce(a));
						
						Azucar=-1;
						Colorante=-2;
					}
				}
										
			}
			
			if(tipo_confite==2) {
				
				if(Azucar<4 || Colorante<4) {
					
					//llamar a secretaria para que utilice el metodo de llamar al proveedor
					
					for(i=0;i<cantidad_dulce;i++) {
						Deposito_confites.add(new Dulce(b));
						Azucar=-3;
						Colorante=-3;
					}
							
				}
				else {
					
					for(i=0;i<cantidad_dulce;i++) {
				
						Deposito_confites.add(new Dulce(b));
						Azucar=-3;
						Colorante=-3;
					}
					
				}
			}
			
			if(tipo_confite==3) {
				
				if(Azucar<6 || Colorante<3) {
					
					//llamar a secretaria para que utilice el metodo de llamar al proveedor
					
					for(i=0;i<cantidad_dulce;i++) {
						Deposito_confites.add(new Dulce(c));
						Azucar=-5;
						Colorante=-2;
					}
							
				}
				else {
					for(i=0;i<cantidad_dulce;i++) {
						Deposito_confites.add(new Dulce(c));
						Azucar=-5;
						Colorante=-2;
					}
				}
			}	
		}
		
		input.close();
		
	}

}
