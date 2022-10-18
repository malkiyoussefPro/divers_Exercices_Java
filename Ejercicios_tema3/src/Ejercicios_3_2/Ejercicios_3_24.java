package Ejercicios_3_2;

import java.util.Scanner;

public class Ejercicios_3_24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// pedir al usuario una cadena de caracteres por teclado
		System.out.println("- Escribir una letra: ");
		String letra = scan.next();
		char letraSiguiente =letra.charAt(0);
	
		// Mostrar por pantalla el ultimo caractere 
		System.out.println("- La siguiente letra: '"+letra+"' según el alfabeto es: \n- "+letraSiguiente);

	}
}
