package Ejercicios_3_2;

import java.util.Scanner;

public class Ejercicios_3_21 {

	public static void main(String[] args) {
		// declarar variables
		float celicius, fahrenhit;
		Scanner scan = new Scanner(System.in);
		System.err.println("- Ingresar el grado Fahrenheit:  ");
		//pedir al teclado grados Fahrenheit
		fahrenhit = scan.nextFloat();
		scan.nextLine();
		// Opreacion para convertir del grados Fahrenheit en grados Celsius
		celicius= (float) ((fahrenhit-32)/1.8);
		// Mostrar por pantalla la conversion de grados Fahrenheit en grados Celsius
		System.out.println("- La conversion de grados Fahrenheit: "+fahrenhit+" a Celsius es: "+celicius);

	}

}
