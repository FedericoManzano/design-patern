package builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentacion {
	List<String> contenido = new ArrayList<String>();
	
	
	public abstract void agregaDocumento(String documento);
	public abstract void imprime();
}
 