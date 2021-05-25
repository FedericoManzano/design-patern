package patron.decorator;

public class Arquero extends PersonajeAdapter {

	private static final String 	NOMBRE 		= "Arquero";
	private static final int 		ATAQUE 		= 12;
	private static final int 		DEFENSA 	= 1;
	private static final int 		VELOCIDAD 	= 10;
	private static final int 		SALUD 		= 40;
	
	
	public Arquero() {
		super(NOMBRE, ATAQUE, DEFENSA, VELOCIDAD, SALUD);
	}
	
	public Arquero(String tipo, int ataque, int defensa, int velocidad, int salud) {
		super(tipo, ataque, defensa, velocidad, salud);
	}

}
