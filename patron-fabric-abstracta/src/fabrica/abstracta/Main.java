package fabrica.abstracta;

public class Main {

	public static void main(String[] args) {
		FabricaVehiculo fabrica = new FabricaVehiculoElectricidad();
		
		System.out.println("AUTOMOVIL ELECTRICIDAD");
		for(int i = 0; i < 10; i ++) 
			fabrica.creaAutomovil("Ford 100", "Verde", i + 7, 5.35 + i).mostrarCaracteristicas();
		System.out.println("--------------------------------");
		
		System.out.println("SCOOTER ELECTRICIDAD");
		for(int i = 0; i < 10; i ++) 
			fabrica.creaScooter("Clasico", "Verde", i + 7).mostrarCaracteristicas();
		System.out.println("--------------------------------");
		
		
		fabrica = new FabricaVehiculoGasolina();
		
		System.out.println("AUTOMOVIL GASOLINA");
		for(int i = 0; i < 10; i ++) 
			fabrica.creaAutomovil("Ford 100", "Verde", i + 7, 5.35 + i).mostrarCaracteristicas();
		System.out.println("--------------------------------");
		
		System.out.println("SCOOTER GASOLINA");
		for(int i = 0; i < 10; i ++) 
			fabrica.creaScooter("Clasico", "Verde", i + 7).mostrarCaracteristicas();
		
	}

}
