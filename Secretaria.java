import java.util.*;
public class Secretaria {
	
	ArrayList<Dulce> pedidoSec=new ArrayList<>();
	
	
	
	public static void tomarPedido() {
		
		Scanner input=new Scanner (System.in);
		String decision="no";
		
		while(!decision.equals("si")) {
		
			System.out.println("Hola, que desea?");
			
			System.out.println("- Chocolate");
			System.out.println("- Gomitas");
			System.out.println("- Caramelos");
	
			String tipo_dulce=input.next();
			System.out.println("¿Cuántos desea?");
			int cantidad_dulces=input.nextInt();
			
			if(tipo_dulce.equals("chocolate")){
				if(Secretaria.verificarStock(tipo_dulce,cantidad_dulces)==false) {
						
						Manufactura.CrearDulce();
						
				}	
			
				else {
						
						borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
						
						
				}
			}
			
			
			if(tipo_dulce.equals("gomitas")){
					
				if(Secretaria.verificarStock(tipo_dulce,cantidad_dulces)==false) {
						
						Manufactura.CrearDulce();
						
						
				}
				else {
						
						borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
						
						
				}
								
			}
			
			if(tipo_dulce.equals("caramelos")){
				if(Secretaria.verificarStock(tipo_dulce,cantidad_confite)==false) {
						
						Manufactura.CrearDulce();
						
						
				}
				else {
						
						borrarDulces(tipo_dulce,cantidad_dulces);//ejecutar el metodo para que coja los dulces de los depositos 
						
						
				}
							
			}
				
				
				
			}
			
			System.out.println("¿Desea algo mas?");
			String decision_final=input.next();
			
			if(decision_final.equals("si")){
				
				decision="no";
			}
			
			if(decision_final.equals("no")) {
				
				
				decision="si";
			}							
		}
					
	private static boolean verificarStock(String tipo_dulce,int cantidad_dulces){
						
		if(tipo_dulce.equals("chocolate")){
			
		    ArrayList<Dulce> deposito=Manufactura.Deposito_chocolate;
			int tamaño_deposito=deposito.size();
			
			if(tamaño_deposito<cantidad_dulces) {
				
				return false;	
				
			}
			else {
				return true;
			}
		}
		
		if(tipo_dulce.equals("gomitas")){
			
		    ArrayList<Dulce> deposito=Manufactura.Deposito_gomitas;
			int tamaño_deposito=deposito.size();
			
			if(tamaño_deposito<cantidad_dulces) {
				
				return false;	
				
			}
			else {
				return true;
			}
							
		}
		
		if(tipo_dulce.equals("caramelos")){
			
		    ArrayList<Dulce> deposito=Manufactura.Deposito_confites;
			int tamaño_deposito=deposito.size();
			
			if(tamaño_deposito<cantidad_dulces) {
				
				return false;	
				
			}
			else {
				return true;
			}
							
		}
		return true;
								
	}
	
	private void llamarProveedor(Proveedor p) {
		p.Suministrar();
	}
	
	public  void borrarDulces(String dulce, int cantidad) {
		if (dulce.equals("chocolate")) {
			for(int j=0;j<cantidad;j++) {
				pedidoSec.add(Deposito_chocolate[j]);
				Manufacturera.Deposito_chocolate.remove(j);
			}
		}
		if (dulce.equals("gomitas")) {
			String marca=dulce.getMarca();
			for(int j=0;j<cantidad;j++) {
				pedidoSec.add(Deposito_gomitas[j]);
				Manufacturera.Deposito_gomitas.remove(j);
			}
		}
		if (dulce.equals("caramelos")) {
			for(int j=0;j<cantidad;j++) {
				pedidoSec.add(Deposito_caramelos[j]);
				Manufacturera.Deposito_caramelos.remove(j);
			}
		}
		Repartidor.pedido=pedidoSec;
		pedidoSec=null;
		
	}
			
				
}
