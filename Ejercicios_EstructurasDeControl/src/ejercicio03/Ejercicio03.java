/**
 * Ejercicio 3
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana.
 */

package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static void ejercicio03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce dia de la semana (1-7): ");
		int diaSemana = sc.nextInt();
		sc.nextLine();
		
		switch(diaSemana) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miércoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sábado");
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("El día de la semana no se encuentra entre el dia 1 y el 7");
		}
		sc.close();
	}

	public static void main(String[] args) {
		ejercicio03();

	}

}
