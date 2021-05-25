package patron.observer;

public class Receptor implements Observer<Mensaje> {
	private String nombre;
	private Mensaje mensaje;
	
	
	public Receptor(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void actalizar(Mensaje mensaje) {
		this.mensaje = mensaje;
		this.mostrar();
	}
	
	public void mostrar() {
		if(this.mensaje != null)
			System.out.println(mensaje + " Soy el Observador: " + this.nombre);
		else 
			System.out.println("Este usuario no posee mensajes pendientes");
	}
	
	public boolean equals(Object obj) {
		Receptor r = (Receptor ) obj;
		if(r == this)
			return true;
		if(r.nombre.equals(this.nombre))
			return true;
		return false;
	}
}
