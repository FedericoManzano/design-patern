package patron.decorator;

public class Escudero extends PersonajeAdapter {

	
	private static final String 	NOMBRE 		= "Escudero";
	private static final int 		ATAQUE 		= 7;
	private static final int 		DEFENSA 	= 6;
	private static final int 		VELOCIDAD 	= 8;
	private static final int 		SALUD 		= 40;
	
	
	public Escudero() {
		super(NOMBRE, ATAQUE, DEFENSA, VELOCIDAD, SALUD);
	}
	
	
	public Escudero(String tipo, int ataque, int defensa, int velocidad, int salud) {
		super(tipo, ataque, defensa, velocidad, salud);
	}

}
