package patron.observer;

public class Mensaje {
	private String emisor;
	private String mensaje;
	private String receptor;
	
	public Mensaje( String emisor, String mensaje, String receptor ) {
		this.emisor = emisor;
		this.mensaje = mensaje;
		this.receptor = receptor;
	}
	
	public Mensaje( String emisor, String mensaje ) {
		this.emisor = emisor;
		this.mensaje = mensaje;
	}


	public String getEmisor() {
		return emisor;
	}


	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public String getReceptor() {
		return receptor;
	}


	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}


	@Override
	public String toString() {
		return "Mensaje [emisor=" + emisor + ", mensaje=" + mensaje + "]";
	}
	
	
}
