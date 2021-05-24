package patron.decorator;

public class Turbo extends VehiculoDecorator {

	public Turbo(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public int getVelocidad() {
		return super.vehiculo.getVelocidad() + 30;
	}

	@Override
	public String getModelo() {
		return super.vehiculo.getModelo() + "(+ Turbo 30)";
	}

}
