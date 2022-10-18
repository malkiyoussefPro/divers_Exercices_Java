package Ejercicios_3_2;

import java.util.Scanner;

public class Ejercicios_3_23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// pedir al usuario una cadena de caracteres por teclado
		System.out.println("- Escribir una frase: ");
		String frase = scan.nextLine();
		// Mostrar por pantalla el ultimo caractere 
		System.out.println("- El ultimo caracter de la frase: '"+frase+"' es: \n - "+frase.charAt(frase.length()-1));
		
	}

}
