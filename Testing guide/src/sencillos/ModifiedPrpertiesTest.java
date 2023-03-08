package sencillos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModifiedPrpertiesTest {

	@Test
	void testModifyingPropertie() {
		ModifiedPrperties sut=new ModifiedPrperties();
		int modifier = 5;
		//posicion inicial
		int algo = sut.getAlgo();
		sut.modifyingPropertie(modifier);
		assertEquals(algo+modifier, sut.getAlgo());
	}

}
