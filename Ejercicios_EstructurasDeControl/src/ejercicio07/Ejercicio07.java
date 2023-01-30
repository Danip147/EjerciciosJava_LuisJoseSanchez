/**
 * Ejercicio 7
 * Realiza un programa que calcule la media de tres notas.
 */

package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void ejercicio07() {
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
		
	
		sc.close();
		
	}
	
	public static void ejercicio07B() {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce número " +(i+1)+ " : ");
			numeros[i] = sc.nextInt();
		}
		
		int suma = 0;
		
		for (int numero : numeros) {
			suma = suma + numero; 
		}
		
		int media = suma / 3; 
		
		System.out.println("La media de las 3 notas es: " + media);
		
	
		sc.close();
	}
	
	public static void main(String[] args) {
		//ejercicio07();
		ejercicio07B();

	}

}
