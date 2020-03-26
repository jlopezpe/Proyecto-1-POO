package Excepciones;

public class dulceEquivocado extends errorPedido {
	private String tipo;
	public dulceEquivocado (String cantidad) {
		super();
		tipo=cantidad;
	}
	public String getMessage() {
		String Mensaje=super.getMessage()+"\nNo trabajamos con "+tipo+", por favor elija chocolate, gomitas o caramelos";
		return Mensaje;
	}
}
