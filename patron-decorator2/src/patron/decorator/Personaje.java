package patron.decorator;

public abstract class Personaje {
	
	
	protected String tipo;
	protected int ataque;
	protected int defensa;
	protected int velocidad;
	protected int salud;
	
	
	

	public Personaje(String tipo, int ataque, int defensa, int velocidad, int salud) {
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.salud = salud;
	}

	public void atacar(Personaje atacado) {
		atacado.recibir(this);
	}
	
	public void recibir(Personaje agresor) {
		if(this == agresor)
			return;
		if((this.getSalud() + this.getDefensa()) >= agresor.getAtaque()) {
			if(this.getDefensa() <= agresor.getAtaque()) {
				int salud = this.getSalud();
				salud -= (agresor.getAtaque() - this.getDefensa());
				this.setSalud(salud);
			}
		}
	}
	
	public String getTipo () {
		return this.tipo;
	}
	
	public abstract int getAtaque();
	public abstract int getDefensa();
	public abstract int getVelocidad();
	public abstract int getSalud();
	
	public abstract void setAtaque(int ataque);
	public abstract void setDefensa(int defensa);
	public abstract void setVelocidad(int velocidad);
	public abstract void setSalud(int salud);
	
}
