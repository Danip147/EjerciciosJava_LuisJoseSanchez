/**
 * Ejercicio 1
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */

package ejercicio01;

public class Ejercicio01 {

	public static void ejercicio01() {
		int x = 144;
		int y = 999;

		System.out.println("X vale: " + x);
		System.out.println("Y vale: " + y);
		System.out.println("El resultado de sumar " + x + " + " + y + " es : " + (x + y));
		System.out.println("El resultado de restar " + y + " - " + x + " es : " + (y -x));
		System.out.println("El resultado de dividir " + y + " / " + x + " es : " + (y / x));
		System.out.println("El resultado de multiplicar " + x + " * " + y + " es : " + (x * y));

	}

	public static void main(String[] args) {
		ejercicio01();

	}

}
