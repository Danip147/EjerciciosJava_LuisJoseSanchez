/**
 * Ejercicio 2
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 */

package ejercicio02;

public class Ejercicio02 {

	public static void ejercicio02() {
		int i = 0;

		while (i <= 100) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		ejercicio02();

	}

}
