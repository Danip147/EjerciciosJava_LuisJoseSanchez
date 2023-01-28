/**
 * Ejercicio 5
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle while.
 */

package ejercicio05;

public class Ejercicio05 {

	public static void ejercicio05() {
		int i = 320;

		while (i >= 160) {
			System.out.println(i);
			i -= 20;
		}
	}

	public static void main(String[] args) {
		ejercicio05();

	}

}
