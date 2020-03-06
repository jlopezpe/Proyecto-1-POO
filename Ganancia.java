public class Ganancia extends OpcionDeMenu{
  public void ejecutar(){
    
    cso.ganancias();
    if(cso.ganancias() >=0){
    System.out.println("Esta es la ganancia de la empresa" + cso.ganancias() +"pesos");
    }
    else{
      System.out.println("Lamentablemente la empresa ha entrado en bancarrota con una perdida de " + (cso.ganancias())*-1 +"pesos");
  } 
}
}
