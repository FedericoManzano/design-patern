package patron.prototype;

public class Baul extends AutoParte {
	
	private String color;
	private Long ancho;
	private Long alto;
	
	
	
	public Baul(String nombre, String color, Long ancho, Long alto) {
		super(nombre);
		this.color = color;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public void presentarEstado() {
		System.out.println(nombre + ": SI " + "Color: " + color + " " + "Ancho: " + ancho + " " + "Alto: " + alto);
	}
}
