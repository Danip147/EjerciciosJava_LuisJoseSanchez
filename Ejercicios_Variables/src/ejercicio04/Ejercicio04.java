/**
 * Ejercicio 4
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */

package ejercicio04;

public class Ejercicio04 {
	
	public static void ejercicio04() {
		double euros = 20;
		double pesetas = 166.386;
		
		System.out.println(euros + " € equivale a: " + (pesetas*euros)+ " pst"  );
	}

	public static void main(String[] args) {
		ejercicio04();

	}

}
