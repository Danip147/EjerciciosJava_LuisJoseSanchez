/**
 * Ejercicio 9
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 */

package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
	
	public static void ejercicio09() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número y te diré cuantos dígitos tiene:");
		
		int numeroUsuario = sc.nextInt();
		int n = numeroUsuario;
		int numeroDeDigitos = 1;
		
		while (n >= 10) {
			n /= 10;
			numeroDeDigitos++;
		}
		
		System.out.println(numeroUsuario + " tiene " + numeroDeDigitos + " dígito" + (numeroUsuario<10? "" : "s"));
		
		
		sc.close();
	}

	public static void main(String[] args) {
		ejercicio09();

	}

}
