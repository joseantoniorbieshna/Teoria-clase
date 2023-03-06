package recursividad;


public class FactorialEjemplo {
	public int factorial(int numero) {
		//caso base
		//es decir que no greenra una llamada recursiva
		if (numero == 1)
			return 1;
		else
			//llamada recursiva ¡Siempre con un caso diferente!
			//siempre convergente al caso base
			return numero * factorial(numero-1);
	};

	public static void main(String[] args) {
		int numero=4;
		int resultado=new FactorialEjemplo().factorial(numero);
		
	}
}
