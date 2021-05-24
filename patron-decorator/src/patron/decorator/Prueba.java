package patron.decorator;

public class Prueba {

	public static void main(String[] args) {
		Vehiculo v1 = new Ford100(4, 100, "Ford100", "DFD 252");
		System.out.println(v1);
		System.out.println("---------------------");
		// le pongo un estereo
		v1 = new Estereo(v1);
		System.out.println(v1);
		System.out.println("---------------------");
		v1 = new Turbo(v1);
		System.out.println(v1);
		v1 = new Turbo(v1);
		System.out.println(v1);
		v1 = new AireAcondicionado(v1);
		System.out.println(v1);
	}

}
