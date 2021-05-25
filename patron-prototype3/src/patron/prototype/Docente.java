package patron.prototype;

public class Docente extends PersonalUniversitario {

	
	private String legajo;
	private String materia;
	

	public Docente(String perfil, String nombre, String apellido, String dni, String legajo, String materia) {
		super(perfil, nombre, apellido, dni);
		this.legajo = legajo;
		this.materia = materia;
	}


	@Override
	public void informacion() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "******************************" + "\n" +
			   "Perfil: "		+ super.perfil.toUpperCase()  + "\n" +
			   "Dni: " 			+ super.dni 	+ "\n" +
			   "Legajo: " 		+ this.legajo 	+ "\n" +
			   "Nombre: "		+ this.nombre	+ "\n" +
			   "Apellido:"		+ this.apellido + "\n" +
			   "Materia: "      + this.materia  + "\n" + 
			   "*******************************";
	}


	public String getLegajo() {
		return legajo;
	}


	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public PersonalUniversitario duplica() {
		Docente docente = null;
		try {
			docente = (Docente) this.clone();
			return docente;
		}catch(CloneNotSupportedException e) {
			
		}
		return null;
	}
}
