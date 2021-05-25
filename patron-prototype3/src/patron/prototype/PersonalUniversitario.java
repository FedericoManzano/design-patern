package patron.prototype;

public abstract class PersonalUniversitario implements Cloneable {

	protected String perfil;
	protected String nombre;
	protected String apellido;
	protected String dni;
	
	
	public PersonalUniversitario(String perfil, String nombre, String apellido, String dni) {
		this.perfil = perfil;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public abstract PersonalUniversitario duplica();


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public abstract void informacion();
}
