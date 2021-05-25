package patron.protype;

public class Main {

	public static void main(String[] args) {
		CursoVacio cv = CursoVacio.dameInstanciaDeCursoVacio();
		cv.agregarPersonal(new Docente("Docente", "Teresa", "Bora", "35222111", "1500","1200"));
		cv.agregarPersonal(new Alumno("Alumno","Federico", "Manzano", "35111444","44455",10));
		cv.agregarPersonal(new Alumno("Alumno","Sergio", "Ramos", "25444554","4444",15));
		CursoLLeno cl = new CursoLLeno("1", 200);
		cl.visualiza();
	}

}
