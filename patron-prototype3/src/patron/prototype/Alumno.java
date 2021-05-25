package patron.prototype;

public class Alumno extends PersonalUniversitario implements Cloneable {

	private String matricula;
	private int cantidadMaterias;
	
	
	
	public Alumno(String perfil, String nombre, String apellido, String dni, String matricula, int cantidadMaterias) {
		super(perfil, nombre, apellido, dni);
		this.matricula = matricula;
		this.cantidadMaterias = cantidadMaterias;
	}

	public String toString() {
		return "---------------------------" + "\n" + 
			   "Perfil: "			+ super.perfil.toUpperCase()  + "\n" +
			   "Dni: " 				+ super.dni 	+ "\n" +
			   "Matricula: " 		+ this.matricula 	+ "\n" +
			   "Nombre: "			+ this.nombre	+ "\n" +
			   "Apellido:"			+ this.apellido + "\n" +
			   "CantidadMaterias: " + this.cantidadMaterias + "\n" +
			   "---------------------------" + "\n";
	}

	@Override
	public void informacion() {
		System.out.println(this.toString());
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCantidadMaterias() {
		return cantidadMaterias;
	}

	public void setCantidadMaterias(int cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public PersonalUniversitario duplica() {
		Alumno alumno = null;
		try {
			alumno = (Alumno) this.clone();
			return alumno;
		}catch(CloneNotSupportedException e) {
			
		}
		return null;
	}
}
