package colorBox;

import java.util.Scanner;

public class hacerPedido extends OpcionDeMenu {
	
	public  void ejecutar() {
		
		Scanner input=new Scanner (System.in);
		System.out.print("Bienvenido(a), antes de hacer el pedido, por favor responda las preguntas del formulario.");
		System.out.print("�Cu�l es su nombre?");
		String nombre=input.next();
		System.out.print("�Cu�l es su direcci�n?");
		String direccion=input.next();
		System.out.print("�Cu�l es su tel�fono");
		int celular=input.nextInt();
		Cliente cliente =new Cliente(nombre,celular,direccion);
		
		
		
		
		//aqui se crea objeto o se crea en menu de consola pero entonces hay que a�adirlos como paramtros para que lleguen hasta aqui
		
		
		int condicion_while=1;
		while(condicion_while==1) {
		
			System.out.println("Para hacer su pedido por favor elija el tipo de dulce");
			System.out.println("- Chocolate");
        		System.out.println("- Gomitas");
        		System.out.println("- Confites");
        		String tipo_dulce = input.next();
        		System.out.println("Digite la cantidad de "+tipo_dulce+"que desea");
        		int cantidad_dulce=input.nextInt();
        		cliente.hacerPedido(tipo_dulce, cantidad_dulce);
        		System.out.println("�Desea ordenar algo m�s?");
        		String decision=input.next();
        		if(decision.equals("no")) {
        			System.out.println("Gracias por ordenar, este es su pedido: ");
        			cliente.mostrarFactura();
        			System.out.println("El repartidor va en camino, gracias por utilizar nuestros servicios. Hasta luego");
        			condicion_while=0;
        		}
        		
		}
	}
}
