package patron.decorator;

public class AireAcondicionado extends VehiculoDecorator {

	public AireAcondicionado(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public String getModelo() {
		return super.vehiculo.getModelo() + "(+ Aire Acondionado)";
	}


	@Override
	public int getVelocidad() {
		return vehiculo.getVelocidad();
	}
}
