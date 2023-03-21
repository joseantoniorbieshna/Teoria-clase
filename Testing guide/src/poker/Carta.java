package poker;

public class Carta {
	private Valor valor;
	private Palo palo;
	private boolean repartida = false;

	public Carta(Valor valor, Palo palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}

	public boolean isConsecutiva(Carta ultimaCarta) {
		return valor.getValue() + 1 == ultimaCarta.valor.getValue() && palo == ultimaCarta.palo;
	}
	
	public boolean isOdd() {
		return false;
	}

	public boolean isRepartida() {
		return repartida;
	}

	public void setRepartida(boolean b) {
		repartida = b;
	}

}
