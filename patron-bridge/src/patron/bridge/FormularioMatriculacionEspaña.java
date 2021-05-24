package patron.bridge;

public class FormularioMatriculacionEspaña extends FormularioMatriculacion {

	public FormularioMatriculacionEspaña(FormularioImpl implementacion) {
		super(implementacion);
	}

	@Override
	protected boolean controlZona(String matricula) {
		return matricula.length() == 7;
	}

}
