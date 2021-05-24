package patron.decorator;

public abstract class VehiculoDecorator extends VehiculoAdapter {

	protected Vehiculo vehiculo;
	
	public VehiculoDecorator(Vehiculo  vehiculo) {
		super(vehiculo.cantidadPuertas, vehiculo.velocidad, vehiculo.modelo, vehiculo.matricula);
		this.vehiculo = vehiculo;
	}
}
