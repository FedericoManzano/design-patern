package patron.decorator;

public class Main {

	public static void main(String[] args) {
		Personaje p1 = new Vikingo();
		Personaje p2 = new Vikingo();
		
		p1 = new Escudo(p1);
		p1 = new Escudo(p1);

		
		//p2.atacar(p1);
		//p2.atacar(p1);
		p1.atacar(p2);
		p2 = new Vida(p2);
		
		//System.out.println(p1.getSalud());
		System.out.println(p2.getSalud());
		p1.atacar(p2);
		System.out.println(p2.getSalud());
	}

}
