
package UiMain;

import java.util.*;

import Procesos.Manufactura;
public class CrearDulce extends OpcionDeMenu{
  public void ejecutar(){
    Scanner input=new Scanner (System.in);
    System.out.println("Qu� tipo de dulce la gustar�a crear, por favor escriba como se muestran las opciones \n chocolate \n gomitas \n caramelo");
    String tipo =input.next();
    System.out.println("Estamos verificando, espere un momento, recuerde que nuestra empresa har� 50 ejemplares del tipo de dulce que haya escogido por defecto de la m�quina");
    if (tipo.equals("chocolate")){
      Manufactura.CrearDulce(tipo);
      System.out.println("Se han creado 50 unidades de chocolate");
    }
    if (tipo.equals("gomitas")){
      Manufactura.CrearDulce(tipo);
      System.out.println("Se han creado 50 unidades de gomitas");
    }
     if (tipo.equals("caramelo")){
      Manufactura.CrearDulce(tipo);
      System.out.println("Se han creado 50 unidades de caramelos");
    }
  } 
}