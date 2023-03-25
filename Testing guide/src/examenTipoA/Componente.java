package examenTipoA;

public enum Componente {

	motor(10), pulsador(3), booster(5), orbitador(3), bahia(6), LOX(8);
	
	//valores entre 1 y 10
	private int magnitud;

	private Componente(int magnitud) {
		this.magnitud = magnitud;
	}

	public int getMagnitud() {
		return magnitud;
	}
	
	
}
