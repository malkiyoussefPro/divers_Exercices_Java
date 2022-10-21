package EjerciciosTema_4;
import java.util.Scanner;
public class EjercicioTema_4_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float nota = scan.nextFloat();
		scan.nextLine();
	    System.out.println("- Tu nota final es: ");
	    if ((nota>=9)&&(nota<=10)) {
			System.out.println("- Exelente!!!");
			
		}
	}
}
