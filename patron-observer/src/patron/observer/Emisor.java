package patron.observer;

import java.util.ArrayList;
import java.util.List;

public class Emisor implements Sujeto<Observer<Mensaje>, Mensaje> {

	private String nombre;
	private List<Observer<Mensaje>> receptores;
	
	public Emisor(String nombre) {
		this.nombre = nombre;
		this.receptores = new ArrayList<Observer<Mensaje>>();
	}

	public Mensaje generarMensaje( String texto, String receptor ) {
		Mensaje m = new Mensaje( this.nombre, texto, receptor );
		int indice = receptores.indexOf(new Receptor(receptor));
		if(indice != -1) {
			this.notificar(receptores.get(indice), m);
		}
		return m;
	}
	
	public Mensaje generarMensaje( String texto ) {
		Mensaje m = new Mensaje( this.nombre, texto );
		notificarTodos(m);
		return m;
	}
	
	public void addObserver(Observer<Mensaje> o) {
		this.receptores.add(o);
	}
	
	public void removeObserver(Observer<Mensaje> o) {
		this.receptores.remove(o);
	}
	
	public void removeAll() {
		this.receptores.clear();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		Emisor e = (Emisor) obj;
		if(e == this)
			return true;
		if(e.nombre.equals(this.nombre))
			return true;
		return false;
	}


	@Override
	public void notificarTodos(Mensaje mensaje) {
		for(Observer<Mensaje> o : this.receptores) {
			o.actalizar(mensaje);
		}
		
	}

	@Override
	public void notificar(Observer<Mensaje> receptor, Mensaje mensaje) {
		receptor.actalizar(mensaje);
	}
}
