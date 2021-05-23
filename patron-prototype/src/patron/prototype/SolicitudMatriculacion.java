package patron.prototype;

public class SolicitudMatriculacion extends Documento {

	@Override
	public void imprime() {
		System.out.println(
				"Muestra la solicitud de matriculacion: " + contenido);
		
	}

	@Override
	public void visualiza() {
		System.out.println(
				"Imprime la solicitud de matriculacion: " + contenido);
		
	}

}
