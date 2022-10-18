package EjerciciosTema_4;

import java.util.Scanner;

public class EjerciciosTema_4_1 {
	
	public static final float suplemento=2;
	public static final float precioCompra=30;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("- Ingresa el precio del producto por favor: ");
		float precio = scan.nextFloat();
		if (precio<precioCompra) {
			
			precio = precio+suplemento;
			
		}
		System.out.println("- El precio final a pagar es de: "+precio+" Euros.");
	}

}
