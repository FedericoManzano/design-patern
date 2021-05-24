package patron.prototype;

public class Puerta extends AutoParte {

	private int cantidad;
	
	
	public Puerta(String nombre, int cantidad) {
		super(nombre);
		this.cantidad = cantidad;
	}

	@Override
	public void presentarEstado() {
		System.out.println(nombre + ": SI " + "Cantidad: " + cantidad);
		
	}

}
