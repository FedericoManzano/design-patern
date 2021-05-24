package patron.decorator;

public abstract class Vehiculo {
	protected int cantidadPuertas;
	protected int velocidad;
	protected String modelo;
	protected String matricula;
	
	
	public Vehiculo(int cantidadPuertas, int velocidad, String modelo, String matricula) {
		this.cantidadPuertas = cantidadPuertas;
		this.velocidad = velocidad;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	public abstract int getCantidadPuertas();
	public abstract int getVelocidad();
	public abstract String getModelo();
	public abstract String getMatricula();
	
	
	public String toString() {
		String obj = "Matricula: " + getMatricula()  + "\n";
		obj += "Modelo: " + getModelo() + "\n";
		obj += "Velocidad(KM/H): "+ getVelocidad() + "\n";
		obj += "Puertas: "+ getCantidadPuertas() + "\n";
		return obj;
	}
}
