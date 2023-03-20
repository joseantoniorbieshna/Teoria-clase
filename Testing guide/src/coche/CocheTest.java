package coche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {
	Coche coche;
	
	@BeforeEach
	void beforeEach(){
		coche=new Coche();
		coche.instalarMotor(new Motor());
		assertNotNull(coche.getMotor());
	}

	@Test
	void testHacerViaje() {
		int viajes[]= {5000,11000};
		long acumulador=coche.getKms();
		for (int i = 0; i < viajes.length; i++) {
			acumulador+=viajes[i];
			coche.hacerViaje(viajes[i]);
		}
		assertEquals(acumulador, coche.getKms());
	}

	@Test
	void testComprobarCambioAceite() {
		int antes = 14999;
		coche.setKms(antes);
		assertFalse(coche.comprobarCambioAceite());
		int despues = 2;
		coche.hacerViaje(despues);
		assertTrue(coche.comprobarCambioAceite());
	}

	@Test
	void testCambiarAceite() {
		long acumulador=coche.getUltimoCambioAceite();
		int antes = 14999;
		coche.hacerViaje(antes);
		assertEquals(acumulador, coche.getUltimoCambioAceite());
		int despues = 2;
		coche.hacerViaje(despues);
		assertEquals(coche.getUltimoCambioAceite(),coche.getKms());
	}
}
