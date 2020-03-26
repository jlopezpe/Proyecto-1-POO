package Excepciones;

public class cincuentaMas extends errorPedido {
	private int cantidad;
	public cincuentaMas (int cantidad) {
		super();
		this.cantidad=cantidad;
	}
	public String getMessage() {
		String Mensaje=super.getMessage()+"\nPuede pedir máximo 50 dulces, usted pidio "+cantidad+", por favor corrija";
		return Mensaje;
	}
}
