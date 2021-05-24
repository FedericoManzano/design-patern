package patron.bridge;

public class FormularioMatriculacionPortugal extends FormularioMatriculacion {

	public FormularioMatriculacionPortugal(FormularioImpl implementacion) {
		super(implementacion);
	}

	@Override
	protected boolean controlZona(String matricula) {
		return matricula.length() == 6;
	}

}
