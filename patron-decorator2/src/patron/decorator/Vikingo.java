package patron.decorator;

public class Vikingo extends PersonajeAdapter {
	
	private static final String 	NOMBRE 		= "Vikingo";
	private static final int 		ATAQUE 		= 10;
	private static final int 		DEFENSA 	= 3;
	private static final int 		VELOCIDAD 	= 7;
	private static final int 		SALUD 		= 40;
	
	
	public Vikingo() {
		super(NOMBRE, ATAQUE, DEFENSA, VELOCIDAD, SALUD);
	}
	
	public Vikingo(String tipo, int ataque, int defensa, int velocidad, int salud) {
		super(tipo, ataque, defensa, velocidad, salud);
	}

}
