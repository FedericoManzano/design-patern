package patron.decorator;

public abstract class PersonajeDecorator extends Personaje  {
	
	protected Personaje personaje;
	
	
	public PersonajeDecorator(Personaje personaje) {
		super(personaje.tipo, personaje.ataque, personaje.defensa, personaje.velocidad, personaje.salud);
		this.personaje = personaje;
	}
	
	@Override
	public int getDefensa() {
		return personaje.defensa;
	}

	@Override
	public int getSalud() {
		return personaje.getSalud();
	}


	@Override
	public int getAtaque() {
		return personaje.getAtaque();
	}


	@Override
	public int getVelocidad() {
		return personaje.getVelocidad();
	}


	@Override
	public void setAtaque(int ataque) {
		this.personaje.setSalud(ataque);
	}


	@Override
	public void setDefensa(int defensa) {
		this.personaje.setSalud(defensa);
	}


	@Override
	public void setVelocidad(int velocidad) {
		this.personaje.setSalud(velocidad);
	}


	@Override
	public void setSalud(int salud) {
		this.personaje.setSalud(salud);
	}
}
