package test.personaje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import patron.decorator.Escudo;
import patron.decorator.Espada;
import patron.decorator.Personaje;
import patron.decorator.Vida;
import patron.decorator.Vikingo;

class TestVikingo {

	public static Personaje vikingo1;
	public static Personaje vikingo2;
	public static Personaje vikingo3;
	public static Personaje vikingo4;
	public static Personaje vikingo5;
	
	
	@BeforeAll
	public static void start() {
		vikingo1 = new Vikingo();
		vikingo2 = new Vikingo();
		vikingo3 = new Vikingo();
		vikingo4 = new Vikingo();
		vikingo5 = new Vikingo();
	}
	
	@Test
	void testVikingosSinItemsValoresDefault() {
		// Ataca 10 y defiende 3
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		vikingo1.atacar(vikingo2);
		assertTrue(vikingo2.getSalud() == 5);
	}
	
	@Test
	void testVikingosConEscudoAgregaMasTresEnDefensa() {
		
		// Tiene escudo
		vikingo1 = new Escudo(vikingo1);
		vikingo2.atacar(vikingo1);
		vikingo2.atacar(vikingo1);
		vikingo2.atacar(vikingo1);
		assertTrue(vikingo1.getSalud() == 28);
		
		// Pongo otro escudo no debería tener efecto
		vikingo1 = new Escudo(vikingo1);
		vikingo2.atacar(vikingo1);
		
		assertTrue(vikingo1.getSalud() == 24);
	}
	
	
	@Test
	void testEspadaVikingoAgregaMasTresEnElAtaque() {
		// Tiene espada
		vikingo1 = new Espada(vikingo1);
		vikingo1.atacar(vikingo3);
		vikingo1.atacar(vikingo3);
		vikingo1.atacar(vikingo3);
		
		assertTrue(vikingo3.getSalud() == 10);
		
		vikingo1 = new Espada(vikingo1);
		
		vikingo1.atacar(vikingo4);
		vikingo1.atacar(vikingo4);
		vikingo1.atacar(vikingo4);
	
		assertTrue(vikingo4.getSalud() == 1);
	}
	
	@Test
	void testVidaVikingoRecargalaSaludHastaElTope() {
		vikingo1.atacar(vikingo5);
		vikingo1.atacar(vikingo5);
		vikingo1.atacar(vikingo5);
		
		vikingo5 = new Vida(vikingo5);
		assertTrue(vikingo5.getSalud() == 40);
		
		vikingo1.atacar(vikingo5);
		vikingo1.atacar(vikingo5);
		
		// No queda bloquado en 40
		assertFalse(vikingo5.getSalud() == 40);
	}

	
}
