package UiMain;
import Excepciones.cincuentaMas;
import Excepciones.dulceEquivocado;

import java.util.InputMismatchException;
import java.util.Scanner;
import javafx.application.*;
import Personas.Cliente;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class hacerPedido extends OpcionDeMenu{

	public  String ejecutar() {
        
        
		Scanner input=new Scanner (System.in);
		System.out.print("Bienvenido(a), antes de hacer el pedido, por favor responda las preguntas del formulario.");
		System.out.print("¿Cuál es su nombre?");
		String nombre=input.next();
		System.out.print("¿Cuál es su dirección?");
		String direccion=input.next();
			
				System.out.print("¿Cuál es su telefono?");
				try{
					int celular=input.nextInt();
				}
				catch(InputMismatchException p){
					System.out.println("Ingrese un numero de telefono valido");
					while(true) {
        				try {
        					System.out.println("Ingrese telefono");
        					int cel=input.nextInt();
        					break;
        				}
        				catch(InputMismatchException  m) {
        					System.out.println("Ingrese un numero de telefono valido");
        				}
					}
				}
				
	
		
		Cliente cliente =new Cliente(nombre,"0",direccion);
		
		
		
		
		//aqui se crea objeto o se crea en menu de consola pero entonces hay que añadirlos como paramtros para que lleguen hasta aqui
		
		int condicion_while=1;
		while(condicion_while==1) {

				System.out.println("Para hacer su pedido por favor elija el tipo de dulce:");
				System.out.println("- chocolate");
        		System.out.println("- gomitas");
        		System.out.println("- caramelos");
        		String tipo_dulce=input.next();
        		try {
        			Cliente.verificarTipo(tipo_dulce);
        		}
        		catch(dulceEquivocado n) {
        			System.out.println(n.getMessage());
        			while(true) {
        				try {
        					System.out.println("Ingrese tipo de dulce");
        					tipo_dulce=input.next();
        					Cliente.verificarTipo(tipo_dulce);
        					break;
        				}
        				catch(dulceEquivocado m) {
        					System.out.println(m.getMessage());
        				}
        		}
        		}
        		System.out.println("Digite la cantidad de "+tipo_dulce+" que desea:");
        		int cantidad_dulce=input.nextInt();
        		try {
        			Cliente.verificarCantidad(cantidad_dulce);
        		}
        		catch(cincuentaMas ex) {
        			System.out.println(ex.getMessage());
        			while(true) {
        				try {
        					System.out.println("Ingrese Tipo de dulce");
        					cantidad_dulce=input.nextInt();
        					Cliente.verificarCantidad(cantidad_dulce);
        					break;
        				}
        				catch(cincuentaMas l) {
        					System.out.println(l.getMessage());
        				}
        			}
        		}
        		cliente.hacerPedido(tipo_dulce, cantidad_dulce);
        		
        		System.out.println("¿Desea ordenar algo más?");
        		String decision=input.next();
        		if(decision.equals("no")) {
        			System.out.println("Gracias por ordenar, este es su pedido: ");
        			cliente.mostrarFactura();
        			System.out.println("El repartidor va en camino, gracias por utilizar nuestros servicios. Hasta luego");
        			condicion_while=0;
        			break;
        		}
        		
        		
		}
		return null;
	}
	public String ejecutar2(String nombre,String direccion,String telefono,String decision,String tipo,String cantidad){
        	int cant=Integer.parseInt(cantidad.trim());
        	Cliente cliente=new Cliente(nombre,telefono,direccion);
        	cliente.hacerPedido(tipo,cant);
        	String mens="";
        	if(decision.equals("no")){
            		mens=cliente.mostrarFactura();
        	}return mens;


    	}	
	


}
