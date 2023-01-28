/**
 * Ejercicio 1
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */

package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void ejercicio01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce dia de la semana (1-5): ");
		int diaSemana = sc.nextInt();
		sc.nextLine();
		
		switch(diaSemana) {
		case 1 -> System.out.println("Matemáticas");
		case 2 -> System.out.println("Castellano");
		case 3 -> System.out.println("Educación Física");
		case 4 -> System.out.println("Geografía");
		case 5 -> System.out.println("Música");
		default -> System.out.println("El día de la semana no se encuentra entre el dia 1 y el 5");
		
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		
		ejercicio01();

	}

}
