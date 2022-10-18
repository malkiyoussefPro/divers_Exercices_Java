package EjerciciosTema_4;

import java.util.Scanner;

public class EjerciciosTema_4_2 {
	
	public static final int valor_Secret1=4;
	public static final int valor_Secret2=6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("- Cmenzamos el juego!!!! olé olé");
		
		System.out.println("- Adevina el primer valor entre 0 y 10: ");
		int valorJugador= scan.nextInt();
		scan.nextLine();
		System.out.println("- Adevina el segundo valor entre 0 y 10: ");
		valorJugador= scan.nextInt();
		if ((valor_Secret1==valorJugador)&&(valor_Secret2==valorJugador)) {
			System.out.println("- Exacto los valores eran:"+valor_Secret1+" y "+valor_Secret1+".");
		}else {
			System.out.println("- Te has equivocado!!, intentalos otra vez.");
		}
		System.out.println("- Juego terminado");

	}

}
