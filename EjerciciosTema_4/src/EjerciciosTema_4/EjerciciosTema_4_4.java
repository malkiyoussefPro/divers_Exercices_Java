package EjerciciosTema_4;

import java.util.Scanner;


public class EjerciciosTema_4_4 {

	public static void main(String[] args) {
		
		//Declarar los variables
		int num1,num2,num3;
		Scanner scan = new Scanner(System.in);
		//Pedir al teclado ingresar 3 numeros
		System.out.print("- Ingresa el primer numero por favor: ");
		num1=scan.nextInt();
		System.out.print("- Ingresa el segundo numero por favor: ");
		num2=scan.nextInt();
		System.out.print("- Ingresa el tercer numero por favor: ");
		num3=scan.nextInt();
		
		//Estructura condicional para saber el numero mayor 
		if ((num1>num2)&&(num1>num3)) {
			System.out.print("- El numero mayor entre los numeros: "+num1+", "+num2+", "+num3+". \n"+"- Es el primer numero: "+num1);
		}else if ((num2>num1)&&(num2>num3)) {
			System.out.print("- El numero mayor entre los numeros: "+num1+", "+num2+", "+num3+". \n"+"- Es el segundo numero: "+num2);
		}else {
			System.out.print("- El numero mayor entre los numeros: "+num1+", "+num2+", "+num3+". \n"+"- Es el tercer numero: "+num3);
		}

	}

}
