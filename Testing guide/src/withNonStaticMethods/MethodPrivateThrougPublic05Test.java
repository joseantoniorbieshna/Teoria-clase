package withNonStaticMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodPrivateThrougPublic05Test {

	@Test
	void testAddOdds() {
		int valueOne=1,valueTwo=1;
		int expected=2;
		MethodPrivateThrougPublic05 methodPrivateThrougPublic05=new MethodPrivateThrougPublic05();
		// probando el m�todo private indirectamente 
		assertEquals(expected, methodPrivateThrougPublic05.addOdds(valueOne, valueTwo));
		valueOne=2;
		expected=-1;
		assertEquals(expected, methodPrivateThrougPublic05.addOdds(valueOne, valueTwo));
	}

}
