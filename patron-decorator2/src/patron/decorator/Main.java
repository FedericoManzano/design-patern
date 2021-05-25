package patron.decorator;

public class Main {

	public static void main(String[] args) {
		Personaje p1 = new Vikingo();
		Personaje p2 = new Vikingo();
		
		p2 = new Flash(p2);
		
		System.out.println(p2.getVelocidad());
	}

}
