package Ejercicios_3_2;

public class Ejercicios_3_17 {

	public static void main(String[] args) {

		// Declaracion de la tablas A y B
		int [] tablaA = {1,4,8,9,7};
		int [] tablaB = {2,6,1,3,7};
		int [] tablaC = new int[5];
		for (int i = 0; i < tablaC.length; i++) {
		tablaC[i]=tablaA[i]+tablaB[i];
		}
		for (int i = 0; i < tablaC.length; i++) {
			System.out.println("- La suma de la posicion: "+(i+1)+" suma de ("+tablaA[i]+ " + "+tablaB[i]+")  = "+ tablaC[i]);
		}
	}
}
