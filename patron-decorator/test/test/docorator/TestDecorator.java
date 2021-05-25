package test.docorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import patron.decorator.AireAcondicionado;
import patron.decorator.Auto;
import patron.decorator.Estereo;
import patron.decorator.Turbo;
import patron.decorator.Vehiculo;

class TestDecorator {

	private static Vehiculo vehiculo;
	
	@BeforeAll
	public static void start() {
		vehiculo = new Auto(4,100,"Ford 100","BBC 554");
	}
	
	@Test
	void testAgregarStereoDeocrador() {
		vehiculo = new Estereo(vehiculo);
		assertTrue(vehiculo.getModelo().equals("Ford 100 (+ Con Estereo)"));
	}
	
	@Test
	void testAgregarTurboDecorador() {
		vehiculo = new Turbo(vehiculo);
		assertTrue(vehiculo.getModelo().equals("Ford 100 (+ Con Estereo)(+ Turbo 30)"));
		assertTrue(vehiculo.getVelocidad() == 130);
	}
	
	@Test
	void testAgregarAireAcondicionadoDecorador() {
		vehiculo = new AireAcondicionado(vehiculo);
		assertTrue(vehiculo.getModelo().equals("Ford 100 (+ Con Estereo)(+ Turbo 30)(+ Aire Acondionado)"));
		assertTrue(vehiculo.getVelocidad() == 130);
	}
	
	@Test
	void testAgregarOtroTurboDecorador() {
		vehiculo = new Turbo(vehiculo);
		assertTrue(vehiculo.getModelo().equals("Ford 100 (+ Con Estereo)(+ Turbo 30)(+ Aire Acondionado)(+ Turbo 30)"));
		assertTrue(vehiculo.getVelocidad() == 160);
	}
	
	@Test 
	public void testMetodoToStringDeVehiculo() {
		String obj = "Matricula: " + vehiculo.getMatricula()  + "\n";
		obj += "Modelo: " + vehiculo.getModelo() + "\n";
		obj += "Velocidad(KM/H): "+ vehiculo.getVelocidad() + "\n";
		obj += "Puertas: "+ vehiculo.getCantidadPuertas() + "\n";
		assertTrue(vehiculo.toString().equals(obj));
	}
	
	
}
