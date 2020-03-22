package UiMain;
import java.util.*;

import Personas.Cso;
import Personas.Repartidor;
import Procesos.Manufactura;
public class MenuDeConsola {
	/*OpcionDeMenu op1=new hacerPedido();
	OpcionDeMenu op2=new CrearDulce();
	OpcionDeMenu op3=new AsignarSueldo();
	OpcionDeMenu op4=new Ganancia();
	OpcionDeMenu op5=new ProductoMasVendido();*/
	//OpcionDeMenu[] opciones = new OpcionDeMenu[]{op1,op2,op3,op4,op5,};
	ArrayList<OpcionDeMenu> opciones=new ArrayList<OpcionDeMenu>();
	public void anadirOpcion(OpcionDeMenu op) {
		opciones.add(op);
	}
	public void ejecutarMenu() {
		
		int z=0;
		while(z==0) {
			//poner codigo de la interfaz de usuario
			Scanner input= new Scanner(System.in);
			int a=0;
			
			while(a==0) {
				System.out.println("Por favor escriba el nombre del usuario:");
				String nombre_usuario=input.next();
			
				if(nombre_usuario.equals("usuario")) {
					a=1;	
				}
				else {
					System.out.println("Nombre de usuario incorrecto, por favor escribalo de nuevo");
					a=0;
				}
			}
			a=0;
			while(a==0) {
				System.out.println("Escriba la contraseña");
				String contraseña=input.next();	
				if(contraseña.equals("12345")){		
					a=1;		
				}	
				else {
					System.out.println("Contraseña incorrecta,escribala de nuevo");
					a=0;
				}		
			}
			
			System.out.println("Escoja una de las opciones:");
			System.out.println("1) Hacer Pedido");
			System.out.println("2) Hacer Dulces");
			System.out.println("3) Consultar ganancias");
			System.out.println("4) Asignar sueldo");
			System.out.println("5) Producto más vendido");
			System.out.println("6) Salir");
			
			int opcion=input.nextInt();
			int b=1;
			while(b!=0) {
				if(opcion==1) {
					opciones.get(0).ejecutar();	
				}
				if(opcion==2) {	
					opciones.get(1).ejecutar();
				}	
				if(opcion==3) {				
					opciones.get(2).ejecutar();
				}
				if(opcion==4) {
					opciones.get(3).ejecutar();
				}
				if(opcion==5) {
					opciones.get(4).ejecutar();
				}
				
				if(opcion==6) {
					System.out.println("Gracias , vuelva pronto");
					b=0;
					z=1;
				}
				if(z==1 && b==0) {
					break;
				}
				System.out.println("Escoja una de las opciones:");
				System.out.println("1) Hacer Pedido");
				System.out.println("2) Hacer Dulces");
				System.out.println("3) Consultar ganancias");
				System.out.println("4) Asignar sueldo");
				System.out.println("5) Producto más vendido");
				System.out.println("6) Salir");
				opcion=input.nextInt();	
			}			
		}
	}
	public static void main(String[] args) {
	    Cso cso= new Cso("Diego Armando Maradona",1000000);
	    Repartidor rep1=new Repartidor("Roberto","Repartidor","abc123");
	    Repartidor rep2=new Repartidor("Alberto","Repartidor","def123");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("gomitas");
	    Manufactura.CrearDulce("gomitas");
	    Manufactura.CrearDulce("gomitas");
	    Manufactura.CrearDulce("gomitas");
	    MenuDeConsola menu=new MenuDeConsola();
	    OpcionDeMenu hp=new hacerPedido();
	    menu.anadirOpcion(hp);
		OpcionDeMenu cd=new CrearDulce();
		menu.anadirOpcion(cd);
		OpcionDeMenu as=new AsignarSueldo();
		menu.anadirOpcion(as);
		OpcionDeMenu gan=new Ganancia();
		menu.anadirOpcion(gan);
		OpcionDeMenu pdm=new ProductoMasVendido();
		menu.anadirOpcion(pdm);
	    menu.ejecutarMenu();

	}
}
