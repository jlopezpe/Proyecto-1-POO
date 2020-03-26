package UiMain;

import java.util.*;

import Procesos.Manufactura;
public class CrearDulce extends OpcionDeMenu{
  public String ejecutar(){
    Scanner input=new Scanner (System.in);

    String tipo =input.next();
    System.out.println("Estamos verificando, espere un momento, recuerde que nuestra empresa hará 50 ejemplares del tipo de dulce que haya escogido por defecto de la máquina");
    if (tipo.equals("chocolate")){
      Manufactura.CrearDulce(tipo);
      return("Se han creado 50 unidades de chocolate");
    }
    if (tipo.equals("gomitas")){
      Manufactura.CrearDulce(tipo);
      return("Se han creado 50 unidades de gomitas");
    }
     if (tipo.equals("caramelo")){
      Manufactura.CrearDulce(tipo);
      return("Se han creado 50 unidades de caramelos");
    }
	return tipo;
  }
  public String ejecutar1(String tip){
	    System.out.println("Estamos verificando, espere un momento, recuerde que nuestra empresa hará 50 ejemplares del tipo de dulce que haya escogido por defecto de la máquina");
	    if (tip.equals("chocolate")){
	      Manufactura.CrearDulce(tip);
	      System.out.println("Se han creado 50 unidades de chocolate");
	      return "Se han creado 50 unidades de chocolate";
	    }
	    else if (tip.equals("gomitas")){
	      Manufactura.CrearDulce(tip);
	      System.out.println("Se han creado 50 unidades de gomitas");
	      return "Se han creado 50 unidades de gomitas";
	    }
	    else if (tip.equals("caramelo")){
	      Manufactura.CrearDulce(tip);
	      System.out.println("Se han creado 50 unidades de caramelos");
	      return "Se han creado 50 unidades de caramelos";
	    }
		return null;
	  }
}
