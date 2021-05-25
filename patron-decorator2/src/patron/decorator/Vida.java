package patron.decorator;

public class Vida extends PersonajeDecorator {

	public Vida(Personaje personaje) {
		super(personaje);
		agregarSalud(personaje.getSalud());
	}

	private void agregarSalud(int saludActual) {
		int salud = 40 - saludActual;
		personaje.setSalud(personaje.getSalud() + salud);
	}

}
