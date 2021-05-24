package patron.decorator;

public class AireAcondicionado extends VehiculoDecorator {

	public AireAcondicionado(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public int getCantidadPuertas() {
		return super.vehiculo.getCantidadPuertas();
	}

	@Override
	public int getVelocidad() {
		return super.vehiculo.getVelocidad();
	}

	@Override
	public String getModelo() {
		return super.vehiculo.getModelo() + "(+ Aire Acondionado)";
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return super.vehiculo.getMatricula();
	}

}
