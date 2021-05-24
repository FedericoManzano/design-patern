package patron.adapter;

public class Trabajador extends PersonaAdapter {
	
	public void trabajar() {
		System.out.println("Realizando el trabajo");
	}
	
	public void limpiar() {
		System.out.println("Limpiando el area de trabajo");
	}
}
