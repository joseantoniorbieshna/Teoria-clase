package withNonStaticMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MethodPrivate04 {

	private  boolean tellMe() {
		// TODO volver a private
		// private boolean tellMe() {
		return true;
	}
	
	public boolean hagoCosasPublicas() {
		//...
		return tellMe();
	}
	 class MethodPrivate04Test {

		@Test
		void test() {
			System.out.println("yo el que esta dentro");
			MethodPrivate04 methodPrivate04=new MethodPrivate04();
			assertTrue(methodPrivate04.tellMe());
		}

	}
}

