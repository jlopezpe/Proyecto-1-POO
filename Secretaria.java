import java.util.*;
public class Secretaria {
	
	ArrayList<Dulce> pedido=new ArrayList<>();
	
	
	
	public void tomarPedido(Manufactura m) {
		
		Scanner input=new Scanner (System.in);
		String decision="no";
		
		while(!decision.equals("no")) {
		
			System.out.println("Hola, que desea?");
			
			System.out.println("- Chocolate");
			System.out.println("- Gomitas");
			System.out.println("- Confites");
	
			String tipo_dulce=input.next();
			
			
			if(tipo_dulce.equals("chocolate")){
				
				System.out.println("Que chocolate quiere?"+"  "+"Escriba el n�mero");
				
				String a="Kitkat";
				String b="Crunch";
				String c="Snicker";
				
				
				System.out.println("1) "+a);
				System.out.println("2) "+b);
				System.out.println("3) "+c);
				
				int tipo_chocolate=input.nextInt();
				
				if(tipo_chocolate==1) {
					
					System.out.println("Cuantos quiere?");
					
					int cantidad_dulces=input.nextInt();
			
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
				}
				
				if(tipo_chocolate==2) {
					
					System.out.println("Cuantos quiere?");
					
					int cantidad_dulces=input.nextInt();
			
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
				}
				
				if(tipo_chocolate==3) {
					
					System.out.println("Cuantos quiere?");
					
					int cantidad_dulces=input.nextInt();
			
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
				}
			}
			
			
			
			
			if(tipo_dulce.equals("gomitas")){
				
				System.out.println("Que gomitas quiere?"+"  "+"Escriba el n�mero");
				
				String a="Haribo";
				String b="Trululu";
				String c="Grissly";
				
				
				System.out.println("1) "+a);
				System.out.println("2) "+b);
				System.out.println("3) "+c);
				
				int tipo_gomita=input.nextInt();
				
				if(tipo_gomita==1){
					
					int cantidad_dulces=input.nextInt();
					
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
							
				}
				
				if(tipo_gomita==2){
					
					int cantidad_dulces=input.nextInt();
					
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
							
				}
				
				if(tipo_gomita==3){
					
					int cantidad_dulces=input.nextInt();
					
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
							
				}		
			}
			
			if(tipo_dulce.equals("confites")){
				
				System.out.println("Que confites quiere?"+"  "+"Escriba el n�mero");
					
				String a="Smarties";
				String b="Nikolo";
				String c="Jolly Rancher";
					
					
				System.out.println("1) "+a);
				System.out.println("2) "+b);
				System.out.println("3) "+c);
				
				
				int tipo_confite=input.nextInt();
				
				if(tipo_confite==1){
					
					int cantidad_confite=input.nextInt();
					
					if(this.verificarStock(m,tipo_dulce,cantidad_confite)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
							
				}
				
				if(tipo_confite==2){
					
					int cantidad_dulces=input.nextInt();
					
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
							
				}
				
				if(tipo_confite==3){
					
					int cantidad_dulces=input.nextInt();
					
					if(this.verificarStock(m,tipo_dulce,cantidad_dulces)==false) {
						
						m.CrearDulce();
						
						
					}
					else {
						
						//ejecutar el metodo para que coja los dulces de los depositos 
						
						
					}
							
				}	
				
				
			}
			
			
			
			
			
		}
	}
					
	private boolean verificarStock(Manufactura m,String tipo_dulce,int cantidad_dulces){
						
		if(tipo_dulce.equals("chocolate")){
			
		    ArrayList<Dulce> deposito=m.Deposito_chocolate;
			int tama�o_deposito=deposito.size();
			
			if(tama�o_deposito<cantidad_dulces) {
				
				return false;	
				
			}
			else {
				return true;
			}
		}
		
		if(tipo_dulce.equals("gomitas")){
			
		    ArrayList<Dulce> deposito=m.Deposito_gomitas;
			int tama�o_deposito=deposito.size();
			
			if(tama�o_deposito<cantidad_dulces) {
				
				return false;	
				
			}
			else {
				return true;
			}
							
		}
		
		if(tipo_dulce.equals("confites")){
			
		    ArrayList<Dulce> deposito=m.Deposito_confites;
			int tama�o_deposito=deposito.size();
			
			if(tama�o_deposito<cantidad_dulces) {
				
				return false;	
				
			}
			else {
				return true;
			}
							
		}
		return true;
								
	}
				
}
