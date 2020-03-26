package UiMain;

import Personas.Cso;
public class Ganancia extends OpcionDeMenu{
	
	 public String ejecutar(){	
		 
		 Cso.ganancias();
		 if(Cso.ganancias() >=0){
			 return("Esta es la ganancia de la empresa  " + Cso.ganancias() +" pesos");
		 }
		 else{
			 return("Lamentablemente la empresa ha entrado en bancarrota con una perdida de " + (Cso.ganancias())*-1+" pesos");
		 }
	}
}
