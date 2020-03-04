package colorBox;
import java.util.*;
public class hacerPedido {
	Scanner input = new Scanner(System.in);
	public  void ejecutar() {
		System.out.println("Bienvenido(a), para hacer su pedido por favor elija el tipo de dulce");
		System.out.println("- Chocolate");
        System.out.println("- Gomitas");
        System.out.println("- Confites");
        String tipo_dulce = input.next();
        System.out.println("Digite la cantidad de "+tipo_dulce+"que desea");
        int cantidad_dulce=input.nextInt();
        Cliente.hacerPedido(tipo_dulce,cantidad_dulce);
        System.out.println("¿Desea ordenar algo más?");
        String decision=input.next();
        if(decision.equals("si")) {
        	ejecutar();
        }
        else {
        	System.out.println("Gracias por ordenar, su pedido va en camino");
        }
	}
}
