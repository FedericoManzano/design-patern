package patron.decorator;

public class Estereo extends VehiculoDecorator {

	public Estereo(Vehiculo vehiculo) {
		super(vehiculo);
	}


	public void visualizar() {
		System.out.println(getMatricula() + " " + getModelo() + " " + getCantidadPuertas() + " " + getVelocidad());
	}


	@Override
	public int getCantidadPuertas() {
		return vehiculo.getCantidadPuertas();
	}


	@Override
	public int getVelocidad() {
		return vehiculo.getVelocidad();
	}


	@Override
	public String getModelo() {
		return vehiculo.getModelo() + " (+ Con Estereo)";
	}


	@Override
	public String getMatricula() {
		return vehiculo.getMatricula();
	}

}
