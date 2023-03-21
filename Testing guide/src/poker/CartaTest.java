package poker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	Carta cartasAnteriores[];
	@BeforeEach
	void beforeEach() {
		cartasAnteriores=new Carta[] {
				new Carta(Valor.cinco, Palo.corazones),
				new Carta(Valor.seis, Palo.corazones),
				new Carta(Valor.seis, Palo.corazones)
		};
	}
	
	@Test
	void testIsConsecutiva() {
		Carta cartaPosteriores[]=new Carta[] {
				new Carta(Valor.seis, Palo.corazones),
				new Carta(Valor.seis, Palo.corazones),
				new Carta(Valor.siete, Palo.picas)
		};
		boolean expected[]= {true,false,false};
		for (int i = 0; i < expected.length; i++) {
			System.out.println();
			assertEquals(expected[i],cartasAnteriores[i].isConsecutiva(cartaPosteriores[i]));
		}
	}

	@Test
	void testIsOdd() {
		boolean expected[]= {true,false,true};
		for (int i = 0; i < expected.length; i++) {
			System.out.println();
			assertEquals(expected[i],cartasAnteriores[i].isOdd());
		}
	}

}
