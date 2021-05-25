package patron.protype;

import java.util.ArrayList;

public class CursoVacio extends Curso {
	public static CursoVacio _curso = null;
	
	public CursoVacio() {
		super.curso = new ArrayList<PersonalUniversitario>();
	}
	
	public static CursoVacio dameInstanciaDeCursoVacio() {
		if(_curso == null)
			_curso = new CursoVacio();
		return _curso;
	}
	
	public void agregarPersonal(PersonalUniversitario personal) {
		super.curso.add(personal);
	}
	
	
	public void removerPersonal(PersonalUniversitario personal) {
		super.curso.remove(personal);
	}
	
	public void removerTodo() {
		_curso = null;
	}
}
