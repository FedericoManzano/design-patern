package patron.decorator;

public class Escudo extends PersonajeDecorator {

	public Escudo(Personaje personaje) {
		super(personaje);
	}


	@Override
	public int getDefensa() {
		return personaje.defensa + 3;
	}

}
