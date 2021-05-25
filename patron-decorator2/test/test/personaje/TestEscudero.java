package test.personaje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import patron.decorator.Escudero;
import patron.decorator.Escudo;
import patron.decorator.Espada;
import patron.decorator.Personaje;
import patron.decorator.Vida;
import patron.decorator.Vikingo;

class TestEscudero {

	public static Personaje escudero1;
	public static Personaje escudero2;
	public static Personaje escudero3;
	public static Personaje escudero4;
	public static Personaje escudero5;
	public static Personaje vikingo;
	
	@BeforeAll
	public static void start() {
		escudero1 = new Escudero();
		escudero2 = new Escudero();
		escudero3 = new Escudero();
		escudero4 = new Escudero();
		escudero5 = new Escudero();
		vikingo = new Vikingo();
	}
	
	@Test
	void testEscuderosSinItemsValoresDefault() {
		// Ataca 7 y defiende 6
		escudero1.atacar(escudero2);
		escudero1.atacar(escudero2);
		escudero1.atacar(escudero2);
		escudero1.atacar(escudero2);
		escudero1.atacar(escudero2);
		
		assertTrue(escudero2.getSalud() == 35);
		
	}
	
	@Test
	void testVikingosConEscudoAgregaMasTresEnDefensa() {
		
		// Tiene escudo
		escudero1 = new Escudo(escudero1);
		escudero2.atacar(escudero1);
		escudero2.atacar(escudero1);
		escudero2.atacar(escudero1);
	
		assertTrue(escudero1.getSalud() == 40);
		
		vikingo.atacar(escudero1);
		vikingo.atacar(escudero1);
		vikingo.atacar(escudero1);
		vikingo.atacar(escudero1);
		vikingo.atacar(escudero1);
		
		assertTrue(escudero1.getSalud() == 35);
		
		// Pongo otro escudo no debería tener efecto
		escudero1 = new Escudo(escudero1);
		vikingo.atacar(escudero1);
		
		assertTrue(escudero1.getSalud() == 34);
	}
	
	
	@Test
	void testEspadaVikingoAgregaMasTresEnElAtaque() {
		// Tiene espada
		escudero1 = new Espada(escudero1);
		escudero1.atacar(escudero3);
		escudero1.atacar(escudero3);
		escudero1.atacar(escudero3);
		
		assertTrue(escudero3.getSalud() == 28);
		
		escudero1 = new Espada(escudero1);
		
		escudero1.atacar(escudero3);
		escudero1.atacar(escudero3);
		escudero1.atacar(escudero3);
	
		assertTrue(escudero3.getSalud() == 7);
	}
	
	@Test
	void testVidaVikingoRecargalaSaludHastaElTope() {
		escudero1.atacar(escudero5);
		escudero1.atacar(escudero5);
		escudero1.atacar(escudero5);
		
		escudero5 = new Vida(escudero5);
		assertTrue(escudero5.getSalud() == 40);
		
	}
}