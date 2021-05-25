package patron.prototype;

import java.util.List;

public class Curso  {
	protected String codCurso;
	protected int nroAula;
	protected List<PersonalUniversitario> curso;
	
	public List<PersonalUniversitario> dameCurso() {
		return this.curso;
	}
	
	
}
