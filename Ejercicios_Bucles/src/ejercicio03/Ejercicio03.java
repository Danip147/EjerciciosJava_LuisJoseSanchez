/**
 * Ejercicio 3
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */

package ejercicio03;

public class Ejercicio03 {

	public static void ejercicio03() {
		int i = 0;

		do {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;

		} while (i <= 100);
	}

	public static void main(String[] args) {
		ejercicio03();

	}

}
