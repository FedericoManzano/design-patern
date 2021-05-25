package patron.decorator;

public class Energia extends PersonajeDecorator {
	

	public Energia(Personaje personaje) {
		super(personaje);
		personaje.setSalud(40 * 2);
	}
}
