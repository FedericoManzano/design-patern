package patron.decorator;

public class Espada extends PersonajeDecorator {

	public Espada(Personaje personaje) {
		super(personaje);
	}
	

	@Override
	public int getAtaque() {
		return personaje.getAtaque() + 3;
	}

}
