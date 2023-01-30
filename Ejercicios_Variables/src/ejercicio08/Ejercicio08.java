/**
 * Ejercicio 8
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación
 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 */

package ejercicio08;

public class Ejercicio08 {
	
	public static void ejercicio08() {
		char caracter1 = 'a'; 
		char caracter2 = 'n'; 
		char caracter3 = 'g'; 
		char caracter4 = 'e'; 
		char caracter5 = 'l'; 
		
		String cadena = "" + caracter1 + caracter2 + caracter3 + caracter4 + caracter5;
		
		System.out.println(cadena);
	}

	public static void main(String[] args) {
		ejercicio08();

	}

}
