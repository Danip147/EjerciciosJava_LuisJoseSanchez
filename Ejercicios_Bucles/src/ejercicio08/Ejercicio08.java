/**
 * Ejercicio 8
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */

package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void ejercicio08() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué tabla de multiplicar quiere ver?");
		int numeroUsuario = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " X " + numeroUsuario+ " = " + (i*numeroUsuario));
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		ejercicio08();

	}

}
