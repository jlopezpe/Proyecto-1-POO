package Excepciones;

public class contrasenaIncorrecta extends ErrorAplicacion {
	public contrasenaIncorrecta () {
		super();
	}
	public String getMessage() {
		String Mensaje=super.getMessage()+"/nContrase�a Incorrecta";
		return Mensaje;
	}
}
