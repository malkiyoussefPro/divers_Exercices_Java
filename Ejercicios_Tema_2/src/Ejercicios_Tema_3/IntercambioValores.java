package Ejercicios_Tema_3;

public class IntercambioValores {

	public static void main(String[] args) {
		// declaracion y asignar valores de las variables 
		int numA=58;
		int numB=7;
		int numC=numA;
		
		// intercambio de los valores las variables
		
		numA=numB;

		System.out.println("- el nuevo valor de numA es: "+numA);
		numB=numC;
		System.out.println("- el nuevo valor de numB es: "+numB);

	}

}
