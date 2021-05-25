package patron.decorator;

public class PersonajeAdapter extends Personaje {

	public PersonajeAdapter(String tipo, int ataque, int defensa, int velocidad, int salud) {
		super(tipo, ataque, defensa, velocidad, salud);
	}

	@Override
	public int getAtaque() {
		return super.ataque;
	}

	@Override
	public int getDefensa() {
		return super.defensa;
	}

	@Override
	public int getVelocidad() {
		return super.velocidad;
	}

	@Override
	public int getSalud() {
		return super.salud;
	}

	@Override
	public void setAtaque(int ataque) {
		super.ataque = ataque;
	}

	@Override
	public void setDefensa(int defensa) {
		super.defensa = defensa;
	}

	@Override
	public void setVelocidad(int velocidad) {
		super.velocidad = velocidad;
		
	}

	@Override
	public void setSalud(int salud) {
		super.salud = salud;
	}
	

}
