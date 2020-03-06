import java.util.*;
public class CrearDulce extends OpcionDeMenu{
  public void ejecutar(){
    Scanner input=new Scanner (System.in);
    System.out.println("Qué tipo de dulce la gustaría crear, por favor escriba como se muestran las opciones \n chocolate \n gomitas \n caramelo");
    String tipo =input.next();
    System.out.println("Estamos verificando, espere un momento, recuerde que nuestra empresa hará 50 ejemplares del tipo de dulce que haya escogido por defecto de la máquina");
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
    System.out.println("Aún quedan en el almacenamiento" + Manufactura.Azucar +" kilos de azucar" + Manufactura.Colorante + " litros de colorante"+ Manufactura.Almidon +" kilos de almidón"); 
  } 
}
