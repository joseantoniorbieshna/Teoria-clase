package poker;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Baraja {
	List<Carta> cartas;

	public Baraja() {
		super();
		cartas = new LinkedList<>();
		rellenar();
	}

	/**
	 * Crea las cartas de la baraja
	 */
	private void rellenar() {
		for (int i = 0; i < Palo.length(); i++) {
			for (int j = 0; j < Valor.length(); j++) {
				cartas.add(new Carta(Valor.getByValue(j), Palo.getByValue(i)));
			}
		}

	}

	/**
	 * Desordena las cartas de la baraja, es como si las barajase
	 */
	public void barajar() {
		int intercambios = 1000;
		for (int i = 0; i < intercambios; i++) {
			intercambiar();
		}
	}

	private void intercambiar() {
		int origen = new Random().nextInt(cartas.size());
		int destino = new Random().nextInt(cartas.size());
		Carta intercambio = cartas.remove(origen);
		cartas.add(intercambio);
	}

	public int size() {
		return cartas.size();
	}

	/**
	 * Es el repsrto inicial de cartas
	 * @param jugadores cuantos jugadores
	 * @param cartasPorBaza cuantas cartas por jugador
	 * @return un mapa con las bazas
	 */
	public Map<Integer, List<Carta>> repartir(int jugadores, int cartasPorBaza) {
		HashMap<Integer, List<Carta>> baza = new HashMap<>();
		int j = 0;
		for (int i = 0; i < jugadores; i++) {
			//Ponlo aqui primero y luego lo cambias
//			int j = 0;
			baza.put(i, new LinkedList<>());
//			for (; j < cartasPorBaza; j++) {
				for (int h=0; h < cartasPorBaza; h++,j++) {
				baza.get(i).add(getCarta(j));
			}
		}
		return baza;
	}

	/**
	 * cambio de cartas de los jugadores
	 * @param bazaActual las jugadas de todos los jugadores
	 * @param cambios las cartas que cada jugadir quiere cambiar.
	 */
	public void descartar(Map<Integer, List<Carta>> bazaActual,Map<Integer, List<Carta>> cambios) {
		
	}
	
	public Carta getCarta(int pos) {
		Carta carta = cartas.get(pos);
		if (!carta.isRepartida()) {
			carta.setRepartida(true);
			return carta;
		}
		return null;
	}
}
