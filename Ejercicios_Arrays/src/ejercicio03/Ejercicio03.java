/**
 * Ejercicio 3
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 */

package ejercicio03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {
	
	public static void ejercicio03() {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numeros = new Integer[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = sc.nextInt();
		
		}
		
		Arrays.sort(numeros); // Los ordena
		
		Collections.reverse(Arrays.asList(numeros)); 
		
		for(Integer numero : numeros) { // los muestra 
			System.out.println(numero);
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

	public static void main(String[] args) {
		ejercicio03();

	}

}
