package patron.decorator;

public class Flash extends PersonajeDecorator {

	public Flash(Personaje personaje) {
		super(personaje);
		personaje.setVelocidad(personaje.getVelocidad() * 2);
	}
}
