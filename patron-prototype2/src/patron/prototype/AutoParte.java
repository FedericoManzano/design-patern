package patron.prototype;

public abstract class AutoParte implements Cloneable {
	
	
	public static Long idIncremento = 1L;
	protected Long id;
	protected String nombre;
	
	public AutoParte(String nombre) {
		this.nombre = nombre;
		this.id = idIncremento; 
		idIncremento ++;
	}

	public AutoParte duplicar() {
		AutoParte duplicado = null;
		try {
			duplicado = (AutoParte) this.clone();
		}catch (CloneNotSupportedException e) {
			return null;
		}
		return duplicado;
	}
	
	public abstract void presentarEstado();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
