package modelo;

import java.util.ArrayList;
import java.util.List;

import utiles.Utiles;

public class TableroAleatorio extends Tablero {
	private boolean terminado = false;

	// Constructor aleatorio
	public TableroAleatorio(int lado, int minas) {
		super(lado);
		List<Coordenada> posiciones = generaAleatorio(minas, lado);
	}

	// constructor no aleatorio
	public TableroAleatorio(int lado, List<Coordenada> posiciones) {
		super(lado);
	}

	
	public void contarMinasAlrededor(List<Coordenada> posiciones) {
		// TODO
	}

	public boolean[][] getCasillasDesveladas() {
		// TODO
		return null;
	}

	public void desvelarContiguas(Coordenada lugar) {
		//TODO
	}

	
	public List<Coordenada> generaAleatorio(int minas, int longitud) {
		//TODO
		return null;

	}

	
}
