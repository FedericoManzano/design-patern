package patron.decorator;

public class Estereo extends VehiculoDecorator {

	public Estereo(Vehiculo vehiculo) {
		super(vehiculo);
	}
	
	@Override
	public String getModelo() {
		return vehiculo.getModelo() + " (+ Con Estereo)";
	}


	@Override
	public int getVelocidad() {
		return vehiculo.getVelocidad();
	}

}
