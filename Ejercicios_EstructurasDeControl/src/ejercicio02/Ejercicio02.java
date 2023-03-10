/**
 * Ejercicio 2
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 */


package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void ejercicio02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce una hora (1-24): ");
		int hora = sc.nextInt();
		sc.nextLine();
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Buenos días");
		}else if(hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		}else if (hora >= 21 && hora <= 5) {
			System.out.println("Buenas noches");
		}else {
			System.out.println("Error, hora introducida incorrecta");
		}
		
		
		sc.close();
	}
	
	public static void main(String[] args) {
		ejercicio02();
	}

}
