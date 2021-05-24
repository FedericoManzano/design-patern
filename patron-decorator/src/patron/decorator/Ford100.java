package patron.decorator;

public class Ford100 extends Vehiculo {

	public Ford100(int cantidadPuertas, int velocidad, String modelo, String matricula) {
		super(cantidadPuertas, velocidad, modelo, matricula);
	}


	@Override
	public int getCantidadPuertas() {
		return super.cantidadPuertas;
	}

	@Override
	public int getVelocidad() {
		return super.velocidad;
	}

	@Override
	public String getModelo() {
		return super.modelo;
	}

	@Override
	public String getMatricula() {
		return super.matricula;
	}
}
