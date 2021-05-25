package patron.prototype;

import java.util.ArrayList;
import java.util.List;



public class CursoLLeno extends Curso {
	
	public CursoLLeno(String codCurso, int nroAula) {
		curso = new ArrayList<PersonalUniversitario>();
		CursoVacio c = CursoVacio.dameInstanciaDeCursoVacio();
		List<PersonalUniversitario> personal = c.dameCurso();
		super.codCurso = codCurso;
		super.nroAula = nroAula;
		
		for( PersonalUniversitario p: personal ) {
			super.curso.add(p);
		}	
		c.removerTodo();
	}
	
	public void visualiza() {
		System.out.println("CURSO: " + super.codCurso + " " + "AULA: " + nroAula);
		for (PersonalUniversitario p: super.curso)
			p.informacion();
	}
}
