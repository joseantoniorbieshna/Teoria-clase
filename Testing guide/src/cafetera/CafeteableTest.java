package cafetera;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CafeteableTest {
	Cafetera cafetera;
	final short capacidadMaxima = (short) 100;
	static Cafetera cafeteraDos;

	@BeforeAll
	static void beforeAll() {
		cafeteraDos = new Cafetera((short) 50);
		cafeteraDos.llenarCafetera();
	}

	@BeforeEach
	void BeforeEach() {
		cafetera = new Cafetera(capacidadMaxima);
		cafetera.llenarCafetera();
	}

	@Test
	void testLlenarCafetera() {
		assertEquals(cafetera.getCantidadActual(), capacidadMaxima);
		cafeteraDos.servirTaza(10);
		System.out.println("cafetera compartida "+cafeteraDos.getCantidadActual());
	}

	@Test
	void testServirTaza() {
		// probando que me sirve la taza si esta por debajo de su capacidad actual
		float factor = 1.5f;
		short taza = ((short) (capacidadMaxima / factor));
		assertEquals(taza, cafetera.servirTaza(taza));
		// si pidiendo una taza que excede la cantidad actual
		short restante = cafetera.getCantidadActual();
		int cantidadSolicitada = restante + 1;
		taza = (short) cafetera.servirTaza(cantidadSolicitada);
		assertEquals(taza, restante);
		assertNotEquals(taza, cantidadSolicitada);
		cafeteraDos.servirTaza(10);
		System.out.println("cafetera compartida "+cafeteraDos.getCantidadActual());
	}

	@Test
	void testVaciarCafetera() {
		cafetera.vaciarCafetera();
		assertEquals(0, cafetera.getCantidadActual());
	}

	@Test
	void testAgregarCafe() {
		// probamos funcionamiento correcto
		cafetera.vaciarCafetera();
		cafetera.agregarCafe(capacidadMaxima);
		assertEquals(capacidadMaxima, cafetera.getCantidadActual());
		// intentar agregar por encima de la capacidad maxima
		cafetera.vaciarCafetera();
		cafetera.agregarCafe(capacidadMaxima * 2);
		assertEquals(capacidadMaxima, cafetera.getCantidadActual());
	}

	@AfterEach
	void afterEach() {
		System.out.println("after each");
	}

	@AfterAll
	static void afterall() {
		System.out.println("after All");
	}
}
