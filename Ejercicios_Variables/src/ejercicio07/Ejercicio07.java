/**
 * Ejercicio 7
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 * mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 * de Java (con un solo println) ¿es posible?
 */

package ejercicio07;

public class Ejercicio07 {
	
	public static void ejercicio07() {
		char letra = 'a';
		char letra1 = 'z';
		String palabra = "abecedario";
		System.out.println(letra + " " +letra1 + " " + palabra);
	}

	public static void main(String[] args) {
		ejercicio07();;
	}

}
