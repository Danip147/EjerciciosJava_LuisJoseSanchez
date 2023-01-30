/**
 * Ejercicio 8
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 */

package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void ejercicio08() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primera nota: ");
		int n1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduce segunda nota: ");
		int n2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduce terecera nota: ");
		int n3 = sc.nextInt();
		sc.nextLine();

		int media = ((n1 + n2 + n3) / 3);

		System.out.println("La media de las tres notas es: " + media);

		switch (media) {
		case 1, 2 -> System.out.println("Insuficiente");
		case 3, 4 -> System.out.println("Suficiente");
		case 5, 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Error");
		}

		sc.close();

	}

	public static void main(String[] args) {
		ejercicio08();

	}

}
