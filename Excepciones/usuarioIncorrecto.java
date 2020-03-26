package Excepciones;

public class usuarioIncorrecto extends ErrorAplicacion{
	public usuarioIncorrecto() {
		super();
		}
	public String getMessage() {
		String mensaje= super.getMessage()+"\nUsuario Incorrecto";
		return mensaje;
	}
	
}
