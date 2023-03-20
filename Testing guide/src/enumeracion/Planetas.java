package enumeracion;

public enum Planetas {
	mercurio(0.1f),marte(0.2f),venus(0.4f),tierra(0.5f);
	
	private float gravedad;
	
	
	private Planetas(float gravedad) {
		this.gravedad = gravedad;
	}

	public float getGravedad() {
		return gravedad;
	}

	public String getAlgo() {
		return "no se";
	}
}
