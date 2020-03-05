package colorBox;
import java.util.Scanner;

public class HacerPedido extends OpcionDeMenu {
	
	public  void ejecutar() {
		
		Scanner input=new Scanner (System.in);
		System.out.print("Antes de hacer el pedido, por favor responda las preguntas del formulario.");
		System.out.print("Cual es su nombre?");
		String nombre=input.next();
		System.out.print("Cual es su direccion?");
		String direccion=input.next();
		System.out.print("Cual es su telefono");
		int celular=input.nextInt();
		new Cliente(nombre,direccion,celular);
		
		
		
		
		//aqui se crea objeto o se crea en menu de consola pero entonces hay que añadirlos como paramtros para que lleguen hasta aqui
		
		
		int condicion_while=1;
		while(condicion_while==1) {
		
			System.out.println("Bienvenido(a), para hacer su pedido por favor elija el tipo de dulce");
			System.out.println("- Chocolate");
        		System.out.println("- Gomitas");
        		System.out.println("- Confites");
        		String tipo_dulce = input.next();
        		System.out.println("Digite la cantidad de "+tipo_dulce+"que desea");
        		int cantidad_dulce=input.nextInt();
        		new Cliente(nombre,direccion,celular).hacerPedido(tipo_dulce, cantidad_dulce);
        		System.out.println("¿Desea ordenar algo más?");
        		String decision=input.next();
        		if(decision.equals("si")) {
        			ejecutar();
        		}
        		else {
        			System.out.println("Gracias por ordenar, su pedido va en camino");
        			condicion_while=0;
        		}
		}
	}
}
