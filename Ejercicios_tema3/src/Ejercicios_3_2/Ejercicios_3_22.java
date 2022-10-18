package Ejercicios_3_2;

import java.util.Scanner;

public class Ejercicios_3_22 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Pedir al teclado para escribir una frase
		System.out.println("- Escribe una frase: ");
		String frase = scan.nextLine();
		//Convertir la frase la frase a miniscula
		System.out.println("- Convertir la frase '"+frase+"' todo en miniscula :\n"+frase.toLowerCase());
		
	}

}
