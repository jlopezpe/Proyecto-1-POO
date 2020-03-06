public class CrearDulce extends OpcionDeMenu{
  public void ejecutar(){  
    if (Secretaria.tipo.equals("chocolate"){
    System.out.println("Usted acaba de crear 80 unidades de chocolate);
    }
     if (Secretaria.tipo.equals("gomitas"){
    System.out.println("Usted acaba de crear 80 unidades de "+ Secretaria.tipo);
     }
     if (Secretaria.tipo.equals("caramelo"){
    System.out.println("Usted acaba de crear 80 unidades de " + Secretaria.tipo);
     }
    System.out.println("Aún quedan en el almacenamiento" + Manufactura.Azucar +" kilos de azucar" + Manufactura.Colorante + " litros de colorante"+ Manufactura.Almidon +" kilos de almidón"); 
  } 
}
