package Ejercicios_3_2;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios3_20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Declarar y Inicializar el array
		double numeroReales[]= new double[3];
		double mediNumeros =0;
		System.out.println("- Ingresa los "+numeroReales.length+" numeros: ");
		
		try {
			for (int i = 0; i < numeroReales.length; i++) {
				
				System.out.print("- El numero de la posicion "+i+":");
				double noumeros=numeroReales[i]= scan.nextDouble();
				
				mediNumeros= (mediNumeros+ numeroReales[i]);
				
			}
			mediNumeros=mediNumeros/numeroReales.length;
			DecimalFormat df = new DecimalFormat("0.00");
			String resultaMedia = df.format(mediNumeros);
			System.out.println("-La media de los numeros ("+numeroReales[0]+", "+numeroReales[1]+", "+numeroReales[2]+") = " +resultaMedia);
			
		} catch (InputMismatchException i) {

			System.out.println("- Error"+i.getMessage());
		}

	}
}
