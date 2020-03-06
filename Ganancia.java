public class Ganancia extends OpcionDeMenu{
	
	 public void ejecutar(){	
		 
		 Cso.ganancias();
		 if(Cso.ganancias() >=0){
			 System.out.println("Esta es la ganancia de la empresa  " + Cso.ganancias() +" pesos");
		 }
		 else{
			 System.out.println("Lamentablemente la empresa ha entrado en bancarrota con una perdida de " + (Cso.ganancias())*-1+" pesos");
		 } 
	}
}