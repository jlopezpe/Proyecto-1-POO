package UiMain;

import Personas.Cso;

public class ProductoMasVendido extends OpcionDeMenu{
	  public  String ejecutar(){ 
		  String mensaje=Cso.mayorVenta();
		  return ("El producto más vendido hasta ahora es "+mensaje);
	  }

}
