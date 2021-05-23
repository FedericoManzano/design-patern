package patron.prototype;

import java.util.ArrayList;
import java.util.List;



public class DocumentacionCliente extends Documentacion {
	public DocumentacionCliente(String informacion) {
		documentos = new ArrayList<Documento>();
		DocumentacionEnBlanco documentacionEnBlanco =
				DocumentacionEnBlanco.Instance();
		List<Documento> documentosEnBlanco =
				documentacionEnBlanco.getDocumentos();
		for (Documento documento: documentosEnBlanco) {
			Documento copiaDocumento = documento.duplica();
			copiaDocumento.rellena(informacion);
			documentos.add(copiaDocumento);
		}
	}
}