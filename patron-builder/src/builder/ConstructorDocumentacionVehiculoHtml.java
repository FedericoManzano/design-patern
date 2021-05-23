package builder;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoHtml() {
		documentacion = new DocumentacionHtml();
	}
	
	
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>";
		documentacion.agregaDocumento(documento);
	}
	
	public void construyeSolicitudMatriculacion (String nombreSolicitante) {
		String documento = "<HTML>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</HTML>";;
		documentacion.agregaDocumento(documento);
	}

}
