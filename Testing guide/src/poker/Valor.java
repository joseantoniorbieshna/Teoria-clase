package poker;

import java.util.Arrays;

public enum Valor {
	uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve, diez, jack,queen,king;

	public int getValue() {
		return Arrays.asList(Valor.values()).indexOf(this)+1;
	}

	public static int length() {
		return values().length;
	}

	public static Valor getByValue(int j) {
		return values()[j];
	}
}
