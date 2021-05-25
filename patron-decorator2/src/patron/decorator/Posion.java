package patron.decorator;

public class Posion extends PersonajeDecorator {

	public int cantidadAtaquesRecibidos;
	
	
	public Posion(Personaje personaje) {
		super(personaje);
		cantidadAtaquesRecibidos = 0;
	}
	
	@Override
	public void setSalud(int salud) {
		if(cantidadAtaquesRecibidos < 3) {
			personaje.setSalud(40);
			cantidadAtaquesRecibidos ++;
		}else {
			personaje.setSalud(salud);
		}
	}
}
