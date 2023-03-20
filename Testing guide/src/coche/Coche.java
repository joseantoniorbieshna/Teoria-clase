package coche;

import java.util.LinkedList;
import java.util.List;

public class Coche {
	private long kms = 0;
	private int cambio = 15000;
	private List<Long> cambiosAceite = new LinkedList();
	Rueda delanteraConductor, traseraConductor, delanteraCopiloto, traseraCopiloto;
	Motor motor;

	void montarRuedas(Rueda delanteraConductor, Rueda traseraConductor, Rueda delanteraCopiloto,
			Rueda traseraCopiloto) {
		this.delanteraConductor = delanteraConductor;
		this.delanteraCopiloto = delanteraCopiloto;
		this.traseraConductor = traseraConductor;
		this.traseraCopiloto = traseraCopiloto;
	}

	void instalarMotor(Motor motor) {
		this.motor = motor;
		this.cambiosAceite.add(0L);
	}

	// Si los viajes superan la cantidad de kms recomendada
	void hacerViaje(long longitud) {
		this.kms+=longitud;
		if(comprobarCambioAceite()) {
			cambiarAceite();
		}
	}

	public boolean comprobarCambioAceite() {
		return  this.kms>cambiosAceite.get(cambiosAceite.size()-1)+cambio;
	}

	void cambiarAceite() {
		cambiosAceite.add(this.kms);
	}

	void cambiarRueda() {

	}

	public Motor getMotor() {
		return motor;
	}

	public long getKms() {
		return kms;
	}

	public void setKms(int i) {
		this.kms = i;

	}
	public long getUltimoCambioAceite() {
		return cambiosAceite.get(cambiosAceite.size()-1);
	}
}
