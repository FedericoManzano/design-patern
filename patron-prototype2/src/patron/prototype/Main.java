package patron.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Carroceria carroceria = Carroceria.nueva();
		carroceria.addPart(new Motor("Motor","25441212", 4));
		carroceria.addPart(new Puerta("Puertas", 4));
		carroceria.addPart(new Baul("Baul","Gris",1L,1L));
		
		Vehiculo v = new Vehiculo();
		v.presentarPartes("Mercedes Benz");
		
		carroceria.addPart(new Motor("Motor","555444556", 12));
		Vehiculo v2 = new Vehiculo();
		
		v2.presentarPartes("Ferrari");
	}

}
