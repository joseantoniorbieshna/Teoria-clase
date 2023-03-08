package sencillos;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PruebaTest {

	@Test
	void testEncontrarMultiplos() {
		Prueba sut=new Prueba();
		//condiciones iniciales
		int divisor=8;
		int[] numeros={2,4,6,8};
		int minimo=2;
		int maximo=8;
		List miLista=Arrays.asList(numeros);
		List encontrarMultiplos = sut.encontrarMultiplos(minimo, maximo, divisor);
		assertArrayEquals(miLista.toArray(),encontrarMultiplos.toArray());
		divisor=10;
		numeros=new int[]{2,5};
		 minimo=2;
		 maximo=8;
		 miLista=Arrays.asList(numeros);
		 assertArrayEquals(miLista.toArray(),sut.encontrarMultiplos(minimo, maximo, divisor).toArray());
	}

}
