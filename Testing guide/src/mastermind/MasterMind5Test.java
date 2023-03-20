package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MasterMind5Test {
	MasterMind5 masterMind5;
	
	@BeforeEach
	void beforeEach() {
		masterMind5=new MasterMind5();
	}

	@Test
	void testSortearEnigma() {
		assertNull(masterMind5.getEnigma());
		masterMind5.sortearEnigma();
		assertNotNull(masterMind5);
		int longitudEsperada = 4;
		assertEquals(longitudEsperada, masterMind5.getEnigma().size());
	}

	@Test
	void testPedirCombinacion() {
		Combinacion combinacion = masterMind5.pedirCombinacion();
		assertNotNull(combinacion);
		int expected = 4;
		assertEquals(expected, combinacion.size());
	}
	
	@Test
	void testComprobarGanador() {
		masterMind5.sortearEnigma();
		int size = 4;
		Combinacion enigma = masterMind5.getEnigma();
		assertTrue(masterMind5.comprobarGanador(enigma));
		Combinacion jugada=new Combinacion(size);
		for (int i = 0; i < jugada.size(); i++) {
			jugada.setColorCombinacionAt(i,enigma.getAt(i));
		}
		ColorCombinacion primerColorEnigma=enigma.getAt(0);
		ColorCombinacion colorJugada=ColorCombinacion.amarillo;
		while(primerColorEnigma.equals(colorJugada)) {
			int longitudColores = ColorCombinacion.values().length;
			int sorteoColores = new Random().nextInt(longitudColores);
			colorJugada=ColorCombinacion.values()[sorteoColores];
		}
		assertFalse(masterMind5.comprobarGanador(jugada));
		ColorCombinacion[] colores;
	}

	@Test
	void testComprobarPosicion() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarColor() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarCombinacion() {
		fail("Not yet implemented");
	}

	@Test
	void testPlay() {
		fail("Not yet implemented");
	}

}
