package patron.observer;

public class Main {

	public static void main(String[] args) {
		Emisor e = new Emisor("Juan");
		
		e.addObserver(new Receptor("Marcelo"));
		e.addObserver(new Receptor("Pedro"));
		e.addObserver(new Receptor("Raul"));
		e.addObserver(new Receptor("Alberto"));
		e.addObserver(new Receptor("Carlos"));
		
		e.generarMensaje("Esto es un mensaje para Marcelo", "Marcelo");
		e.generarMensaje("Esto es un mensaje para todos");
		
		e.removeAll();
	}

}
