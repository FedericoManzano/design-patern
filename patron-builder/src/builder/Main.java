package builder;

public class Main {

	public static void main(String[] args) {
		// Instaciación documentación Html
		ConstructorDocumentacionVehiculo constructor = new ConstructorDocumentacionVehiculoHtml();
		
		Vendedor vendedor = new Vendedor(constructor);
		vendedor.construye("Martin");
		vendedor.construye("Marcos").imprime();
	
	

	}

}
