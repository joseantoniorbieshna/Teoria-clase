package sencillos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrivateYPublicTest {

	@Test
	void testSoyPublico() {
		PrivateYPublic sut=new PrivateYPublic();
		//valores iniciales
		int algo=4;
		int expected=1;
		assertEquals(expected,sut.soyPublico(algo));
		algo=5;
		assertEquals(expected,sut.soyPublico(algo));
	}

}
