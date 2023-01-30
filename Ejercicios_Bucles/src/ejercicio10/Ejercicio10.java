/**
 * Ejercicio 10
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void ejercicio10() {
		Scanner sc = new Scanner(System.in);
	    double num, sum = 0, count = 0;
	    
	    System.out.println("Introduce números positivos (introduce un número negativo para terminar):");
	    
	    while (true) {
	      num = sc.nextDouble();
	      if (num < 0) {
	        break;
	      }
	      sum += num;
	      count++;
	    }
	    
	    double media = sum / count;
	    System.out.println("La media es: " + media);
	    
	    sc.close();
	  }
		
	
	public static void main(String[] args) {
		ejercicio10();

	}

}


