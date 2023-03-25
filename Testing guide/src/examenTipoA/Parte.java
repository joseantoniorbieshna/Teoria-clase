package examenTipoA;

public class Parte {
	private Componente componente;
	private boolean funciona;
	public Parte(Componente componente, boolean funciona) {
		super();
		this.componente = componente;
		this.funciona = funciona;
	}
	public Componente getComponente() {
		return componente;
	}
	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	@Override
	public boolean equals(Object obj) {
		Parte parte=(Parte)obj;
		return this.componente.equals(parte.getComponente());
	}
	
}
