package patron.prototype;

public class Motor extends AutoParte{

	private String nroSerie;
	private int cantidadCilindros;
	
	
	public Motor(String nombre, String nroSerie, int cantidadCilindros) {
		super(nombre);
		this.cantidadCilindros = cantidadCilindros;
		this.nroSerie = nroSerie;
	}

	
	@Override
	public void presentarEstado() {
		System.out.println(nombre + ": SI " + nroSerie + " " + "Cilindros: " + cantidadCilindros);
	}
	
}
