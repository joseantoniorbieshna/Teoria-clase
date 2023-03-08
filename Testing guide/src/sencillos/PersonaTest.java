package sencillos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testCumpleAnnos() {
		Persona sut=new Persona();
		//posicion inicial
		//valores de prueba
		int edad=sut.getEdad();
		int expected=++edad;
		sut.cumpleAnnos();
		int edad2 = sut.getEdad();
		assertEquals(expected, edad2);
	}

}
