package poker;

public enum Palo {
	picas,diamantes,corazones,trebol;
	
	public static int length() {
		return values().length;
	}

	public static Palo getByValue(int i) {
		return values()[i];
	}
}
