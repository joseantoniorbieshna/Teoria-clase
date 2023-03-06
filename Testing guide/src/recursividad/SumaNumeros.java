package recursividad;

public class SumaNumeros {
	public static void main(String[] args) {
		int[] numeros={45,34,34,23,54,56,-1};
		System.out.println(new SumaNumeros().sumaNumeros(numeros, numeros.length-1));
	}
	public long sumaNumeros(int[]numeros,int index){
		//caso base
		if(index==0) {
			return numeros[index];
		}
		//caso recursivo
		long l = numeros[index]+sumaNumeros(numeros, index-1);
		return l;
	}
}
