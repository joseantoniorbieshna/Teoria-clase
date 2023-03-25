package examenTipoA;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NaveTestProf {
	Nave nave;

	@BeforeEach
	void beforeEach() {
		List<Parte> partes = new LinkedList<>();
		// valores de los componentes 6,5,8,10,3,3
		Componente[] componentes = { Componente.bahia, Componente.booster, Componente.LOX, Componente.motor,
				Componente.orbitador, Componente.pulsador };
		// valor de esta configuracion 6+5+10+3=24
		boolean[] funciona = { true, true, false, true, true, false };
		for (int i = 0; i < componentes.length; i++) {
			partes.add(new Parte(componentes[i], funciona[i]));
		}
		List<Parte> criticos = new LinkedList<>();
		Componente[] componentesCriticos = { Componente.booster, Componente.bahia, Componente.motor };
		for (int i = 0; i < componentesCriticos.length; i++) {
			criticos.add(new Parte(componentesCriticos[i], funciona[i]));
		}
		nave = new Nave("Valkirio", partes, criticos);
	}

	@Test
	void testComprobacionSistemas() {
		int noCumple = 25, cumple = 24;
		nave.setRequsitosNumericos(noCumple);
		assertFalse(nave.comprobacionSistemas());
		nave.setRequsitosNumericos(cumple);
		assertTrue(nave.comprobacionSistemas());
		nave.getPartes().remove(0);
		assertFalse(nave.comprobacionSistemas());

	}

	@Test
	void testArrancar() {
		int cumple;
		assertTrue(nave.arrancar());
		nave.setRequsitosNumericos(25);
		assertFalse(nave.arrancar());
		nave.setRequsitosNumericos(24);
		nave.getRequisitosCriticos().add(new Parte(Componente.LOX,true));
		assertFalse(nave.arrancar());
	}

	@Test
	void testCosteAveria() {
		int coste=11;
		assertEquals(coste,nave.costeAveria());
		Iterator<Parte> iterator = nave.getPartes().iterator();
		boolean funciona=false;
		Parte parte =null;
		while(iterator.hasNext()&&!funciona) {
			Parte next = iterator.next();
			if(next.isFunciona()) {
				funciona=true;
				parte=next;
			}
		}
		if(parte!=null) {
			parte.setFunciona(false);
			coste+=parte.getComponente().getMagnitud();
			assertEquals(coste,nave.costeAveria());
		}
		
	}

}
