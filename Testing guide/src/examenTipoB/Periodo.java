package examenTipoB;

public class Periodo {
	private Programa programa;
	private Long recaudacionParcial;
	private int days;

	public Periodo() {
		super();
	}

	public Periodo(Programa programa, Long recaudacionParcial, int days) {
		super();
		this.programa = programa;
		this.recaudacionParcial = recaudacionParcial;
		this.days = days;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public Long getRecaudacionParcial() {
		return recaudacionParcial;
	}

	public void setRecaudacionParcial(Long recaudacionParcial) {
		this.recaudacionParcial = recaudacionParcial;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
