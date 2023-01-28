/**
 * Ejercicio 1
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 */

package ejercicio01;

public class Ejercicio01 {
	
	public static void ejercicio01() {
		
		for (int i = 0; i < 100; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		ejercicio01();

	}

}
