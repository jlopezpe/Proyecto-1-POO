import java.util.*;
public class Manufacturera {
	
	static ArrayList<Dulce> Deposito_gomitas;
	static ArrayList<Dulce> Deposito_chocolate;
	static ArrayList<Dulce> Deposito_confites;
	
	
	public static void CrearDulce() {
		
		
		String tipo_dulce;
		ArrayList<Dulce> Deposito_chocolate= new ArrayList<Dulce>();
		ArrayList<Dulce> Deposito_gomitas= new ArrayList<Dulce>();
		ArrayList<Dulce> Deposito_confites= new ArrayList<Dulce>();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Que tipo de dulce desea?");
		
		tipo_dulce = input.next();
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
				
				Deposito_chocolate.add(new Dulce(a));
			
										
			}
			
			if(tipo_chocolate==2) {
				
				Deposito_chocolate.add(new Dulce(b));
			}
			
			if(tipo_chocolate==3) {
				
				Deposito_chocolate.add(new Dulce(c));
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
				
				Deposito_gomitas.add(new Dulce(a));
										
			}
			
			if(tipo_gomita==2) {
				
				Deposito_gomitas.add(new Dulce(b));
			}
			
			if(tipo_gomita==3) {
				
				Deposito_gomitas.add(new Dulce(c));
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
				
				Deposito_confites.add(new Dulce(a));
										
			}
			
			if(tipo_confite==2) {
				
				Deposito_confites.add(new Dulce(b));
			}
			
			if(tipo_confite==3) {
				
				Deposito_confites.add(new Dulce(c));
			}	
		}
		
		input.close();
		
	}

}
