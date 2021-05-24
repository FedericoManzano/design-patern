package patron.prototype;

public class Cliente {

	public static void main(String[] args) {
		DocumentacionEnBlanco documentosEnBlanco = DocumentacionEnBlanco.Instance();
		
		// Incluye los documentos 
		documentosEnBlanco.incluye(new SolicitudMatriculacion());
		documentosEnBlanco.incluye(new OrdenDePedido());
		
		
		DocumentacionCliente cliente1 = new DocumentacionCliente("Martin");
		DocumentacionCliente cliente2 = new DocumentacionCliente("marcos");
		
		cliente1.visualiza();
		cliente2.visualiza();
	}

}
