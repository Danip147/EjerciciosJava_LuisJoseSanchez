/**
 * Ejercicio 6
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 */

package ejercicio06;

public class Ejercicio06 {

	public static void ejercicio06() {
		int i = 320;

		do {
			System.out.println(i);
			i -= 20;

		} while (i >= 160);
	}

	public static void main(String[] args) {
		ejercicio06();

	}

}
