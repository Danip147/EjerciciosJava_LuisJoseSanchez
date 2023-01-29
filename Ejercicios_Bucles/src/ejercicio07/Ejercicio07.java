/**
 * Ejercicio 7
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */

package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void ejercicio07() {
		Scanner sc = new Scanner(System.in);

		int combinacion = 1234;
		int respuestaUsuario = 0;
		int intentos = 0;
		boolean entrada = true;

		while (entrada && intentos < 4) {

			System.out.println("Por favor introduce la contraseña: ");
			respuestaUsuario = sc.nextInt();
			if (respuestaUsuario == combinacion) {
				entrada = false;

				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			} else {

				System.out.println("Lo siento, esa no es la combinación");

			}
			intentos++;

		}

		sc.close();
	}

	public static void main(String[] args) {
		ejercicio07();

	}

}
