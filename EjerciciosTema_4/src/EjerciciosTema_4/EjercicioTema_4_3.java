package EjerciciosTema_4;

import java.util.Scanner;

public class EjercicioTema_4_3 {

	public static void main(String[] args) {
		/*
		 * modifique los ejemplos de adivinar (Adivina) un número y 
		 * transformar una nota numérica en textual ( Evaluación Simplificado ) 
		 * para que comprueben que el valor que ha introducido el usuario se 
		 * encuentra dentro del rango de valores correcto (entre 1 y 10). En 
		 * algún caso, quizás no es necesario combinar varias estructuras de selección
		 */
		Scanner scan = new Scanner(System.in);
		
		float nota = scan.nextFloat();
		scan.nextLine();
	    System.out.println("- Tu nota final es: ");
	    if ((nota>=9)&&(nota<=10)) {
			System.out.println("- Exelente!!!");
			
		}
	}
	

}
