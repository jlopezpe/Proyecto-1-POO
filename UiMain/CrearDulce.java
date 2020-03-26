package UiMain;

import java.util.*;

import Procesos.Manufactura;
public class CrearDulce extends OpcionDeMenu{
  public String ejecutar(){
    Scanner input=new Scanner (System.in);

    String tipo =input.next();
    
    if (tipo.equals("chocolate")){
      Manufactura.CrearDulce(tipo);
    }
    if (tipo.equals("gomitas")){
      Manufactura.CrearDulce(tipo);
    }
     if (tipo.equals("caramelo")){
      Manufactura.CrearDulce(tipo);
    }
	return tipo;
  }
  public String ejecutar1(String tip){
	    if (tip.equals("chocolate")){
	      Manufactura.CrearDulce(tip);
	      return "Se han creado 50 unidades de chocolate";
	    }
	    else if (tip.equals("gomitas")){
	      Manufactura.CrearDulce(tip);
	      return "Se han creado 50 unidades de gomitas";
	    }
	    else if (tip.equals("caramelo")){
	      Manufactura.CrearDulce(tip);
	      return "Se han creado 50 unidades de caramelos";
	    }
		return null;
	  }
}
