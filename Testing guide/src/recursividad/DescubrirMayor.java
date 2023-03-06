package recursividad;

import java.util.Arrays;

public class DescubrirMayor {
	public static void main(String[] args) {
		int[] numeros = { 115, 34, 434, 123, 23, 54, 56, 9991 };
		//
		int descubreMayor = new DescubrirMayor().descubreMayor(numeros, numeros.length - 1);
		System.out.println(descubreMayor);
	}

	public int descubreMayor(int[] numeros, int posicion) {
		if (posicion == 0) {
			return numeros[posicion];
		}

		int mayorAnterior = descubreMayor(numeros, posicion - 1);
		if (numeros[posicion] > mayorAnterior) {
			return numeros[posicion];
		}
		return mayorAnterior;
	}

}
