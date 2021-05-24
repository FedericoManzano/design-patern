package patron.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo extends Ensamblaje {
	public Vehiculo() throws CloneNotSupportedException {
		super.autoPartes = new ArrayList<AutoParte>();
		Carroceria carroceria = Carroceria.nueva();
		List<AutoParte> ensambladas = carroceria.obtenerPartes();
		for( AutoParte part: ensambladas) {
			AutoParte copia = (AutoParte) part.clone();
			super.autoPartes.add(copia);
		}
		carroceria.removeAll();
	}
	
	public void presentarPartes (String marca) {
		System.out.println(marca.toUpperCase());
		for(AutoParte a: super.autoPartes) {
			a.presentarEstado();
		}
		System.out.println("-----------------------");
	}
}
