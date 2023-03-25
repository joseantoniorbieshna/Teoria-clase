package examenTipoB;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public enum Programa {
	tembleque(16), volcan(8), casiopea(22), volfgan(21), roman(33), calcio(12);

	private int porcentaje;

	private Programa(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	static Programa getBigger(Programa mayorRecaudacion) {
		List<Programa> list = createList();
		int posicion = list.indexOf(mayorRecaudacion);
		if (posicion != list.size() - 1)
			posicion++;
		return list.get(posicion);
	}

	static Programa getLesser(Programa menorRecaudacion) {
		List<Programa> list = createList();
		int posicion = list.indexOf(menorRecaudacion);
		if (posicion > 0)
			posicion--;
		return list.get(posicion);
	}

	private static List<Programa> createList() {
		Programa[] values = values();
		List<Programa> list = Arrays.asList(values);
		list.sort(new Comparator<Programa>() {
			@Override
			public int compare(Programa o1, Programa o2) {
				return o1.getPorcentaje()-o2.getPorcentaje();
			}
		});
		return list;
	}

}
