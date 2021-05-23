package patron.prototype;

public class CertificadoCesion extends Documento {

	@Override
	public void imprime() {
		System.out.println(
				"Muestra el certificado de cesion: " + contenido);
	}

	@Override
	public void visualiza() {
		System.out.println(
				"Imprime el certificado de cesion: " + contenido);
	}

}
