package mastermind;

import java.util.Scanner;


public class MasterMind5 {
	private Combinacion enigma;
	/**
	 * Sortea el enigma a adivinar
	 * crear Combinacion aleatoria de 4 colores con valores de ColorCombinacion
	 */
	public void sortearEnigma() {
		//TODO
		}
	
	public Combinacion getEnigma() {
		return enigma;
	}

	/**
	 * Pide lo que va en la posicion del vector
	 * @return el vector que se va a comprobar con el sorteado
	 */
	public Combinacion pedirCombinacion() {
		return null;
		//TODO
	}
	
	/**
	 * Comprueba si el resultado obtenido es una combinacion ganadora
	 * @param jugada es la combinacion con la que el usuario participa
	 * @param resultado vector de 4 posiciones 
	 * que representa el resultado de la combinacion 
	 * 
	 * @return verdadero si el resultado esta relleno completamente con negros
	 */
	public boolean comprobarGanador(Combinacion jugada) {
		//TODO
		return false;
	}
	
	/**
	 * Comprueba si los colores coincidentes estan en la posicion correcta
	 * @param combinacion
	 * @param resultado
	 */
	void comprobarPosicion(Combinacion combinacion, ColorResultado[] resultado) {		
		//TODO
	}
	
	/**
	 * Comprueba si la ficha que has metido esta en el vector enigma
	 * Puede haber repeticiones en el enigma
	 * por lo tanto lo que hago es comprobar que colores de la combinacion
	 * aparecen en el enigma. 
	 * @param combinacion es el vector que el jugador ha metido y quiere comprobar
	 * @return el vector resultante que pone 6 si el numero esta en el vector enigma
	 */
	ColorResultado[] comprobarColor( Combinacion combinacion) {
		//TODO
		return null;
	}
	
	/**
	 * Compara la combinacion del jugador con el enigma de la maquina
	 * @param combinacion
	 * @return vector de resultados donde 6 es color y 7 colr y posicion
	 */
	public int[] comprobarCombinacion( Combinacion combinacion) {
		//TODO
		return null;
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}

	public void setEnigma(Combinacion secreta) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
