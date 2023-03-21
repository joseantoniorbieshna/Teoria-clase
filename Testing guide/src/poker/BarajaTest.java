package poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BarajaTest {
	@Test
	void testBarajarDos() {
		Baraja baraja = new Baraja();
		baraja.barajar();
		Baraja segunda=new Baraja();
		baraja.cartas
	}

	@Test
	void testBarajar() {
		Baraja baraja = new Baraja();
		baraja.barajar();
		// Si no estan consecutivas
		int cantidadConsecutivas = 0;
		int maximasConscutivas = 3;
		int maximoActual=0;
		Carta ultimaCarta = baraja.getCarta(0);
		int cantidad = 52;
		for (int j = 1; j < cantidad && cantidadConsecutivas < maximasConscutivas; j++) {
			Carta carta = baraja.getCarta(j);
			if (carta.isConsecutiva(ultimaCarta))
				cantidadConsecutivas++;
			else {
				maximoActual=cantidadConsecutivas;
				cantidadConsecutivas=0;
			}
			assertTrue(maximoActual < maximasConscutivas);
		}
		
	}

}
