package patron.composite;

public class Usuario {

	public static void main(String[] args) {
		EmpresaSinFilial empresa1 = new EmpresaSinFilial();
		EmpresaSinFilial empresa2 = new EmpresaSinFilial();
		
		
		empresa1.agregaVehiculo();
		empresa2.agregaVehiculo();
		empresa2.agregaVehiculo();
		
		EmpresaMadre madre = new EmpresaMadre();
		madre.agregaFilial(empresa1);
		madre.agregaFilial(empresa2);
		madre.agregaVehiculo();
		System.out.println("El costo de mantenimiento total es: " + madre.calculaCosteMantenimiento());

	}

}
