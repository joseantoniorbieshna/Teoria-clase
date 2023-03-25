package examenTipoB;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaTest {
	Maquina maquina;

	@BeforeEach
	void beforeEach() {
		LinkedList<Periodo> periodos = new LinkedList();
		periodos.add(new Periodo(Programa.calcio, 3000L, 100));
		periodos.add(new Periodo(Programa.roman, 12000L, 100));
		periodos.add(new Periodo(Programa.tembleque, 1000L, 100));
		maquina = new Maquina("lolo", 1987, periodos);
	}

	@Test
	void testGetMayorRecaudacion() {
		assertEquals(Programa.roman, maquina.getMayorRecaudacion());

	}

	@Test
	void testGetMenorRecaudacion() {
		assertEquals(Programa.tembleque, maquina.getMenorRecaudacion());
	}

	@Test
	void testAplicarNuevoProgramaConMayorPorcentaje() {
		// ya es el mayor porcentaje
		maquina.aplicarNuevoPrograma();
		assertEquals(Programa.roman, maquina.getUltimoPrograma());

		// hay un programa con porcentaje mayor
		maquina.deleteLastPeriodo();
		maquina.getPeriodos().add(new Periodo(Programa.volfgan, 18000L, 200));
		maquina.aplicarNuevoPrograma();
		assertEquals(Programa.casiopea, maquina.getUltimoPrograma());
	}

	@Test
	void testAplicarNuevoProgramaConMenorPorcentaje() {
		// ya es el menor porcentaje
		// tembleque(16), volcan(8), casiopea(22), volfgan(21), roman(33), calcio(12);
		// bigger volcan 8 lesser tembleque 16 luego debe salir volcan
		maquina.getPeriodos().add(new Periodo(Programa.volcan, 18000L, 200));
		maquina.aplicarNuevoPrograma();
		assertEquals(Programa.volcan, maquina.getUltimoPrograma());
		maquina.deleteLastPeriodo();
		//hay otro con menor porcentaje
		maquina.deleteLastPeriodo();
		maquina.getPeriodos().add(new Periodo(Programa.calcio, 18000L, 200));
		maquina.aplicarNuevoPrograma();
		assertEquals(Programa.volcan, maquina.getUltimoPrograma());
	}
}
