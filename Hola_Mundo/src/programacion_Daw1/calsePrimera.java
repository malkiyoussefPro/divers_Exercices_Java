package programacion_Daw1;

import java.util.Scanner;

public class calsePrimera {

	public static void main(String[] args) {
		//en este codigo vamos a mostrar un mensaje de bienvenida
		System.out.println("- Hola Bienvenidos a todos en el curso de programacion DAW 1");
		
		/*
		 * En este codigo vamos a ver un programa que no musetra si es numero 1 es mayor o menor
		 * del numero 2
		 */
		int numero1;
		int numero2 ;
		System.out.print("ingresa el valor del numero 1: ");
		Scanner scan = new Scanner(System.in);
		numero1= scan.nextInt();
		System.out.print("ingresa el valor del numero 2: ");
		numero2= scan.nextInt();
		if (numero1<numero2) {
			System.out.print("-El numero 1: "+numero1+" es menor que el numero: "+numero2);
		}else {
			System.out.print("-El numero 1: "+numero1+" es mayor que el numero: "+numero2);
		}
		
				

	}

}
