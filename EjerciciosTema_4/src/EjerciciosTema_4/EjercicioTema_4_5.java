package EjerciciosTema_4;

import java.util.Scanner;

public class EjercicioTema_4_5 {

	public static void main(String[] args) {
		
		//Declarar los variables
		Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int numero1 = scan.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scan.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        int numero3 = scan.nextInt();
        
//        	int num;
//        	num = Integer.parseInt(scan.next());
//        System.out.println(num);
        // declaracion constantes
        
        String mensaje = "- El orden de menor a mayor de los numeros: ";
        String coma = ", ";
        
        boolean caso1 = ((numero1 < numero2) && (numero2 < numero3));
        boolean caso2 = ((numero1 > numero2) && (numero2 > numero3));
        boolean caso3 = ((numero1 < numero2) && (numero2 > numero3));
        boolean caso4 = ((numero2 < numero3) && (numero3 < numero1));
        boolean caso5 = ((numero2 > numero1) && (numero1 < numero3));
        boolean caso6 = ((numero3 < numero1) && (numero1 < numero2));
        
        // Sentencia para ordenar los numeros de menor a mayor
        if (caso1) {
            System.out.println(mensaje + numero1 + coma + numero2 + coma + numero3 + " es: \n- " + numero1 + coma + numero2 + coma + numero3 + ".");
        
        } else if (caso2) {
            System.out.println(mensaje + numero1 + coma + numero2 + coma + numero3 + " es: \n- " + numero3 + coma + numero2 + coma + numero1 + ".");
            
        } else if (caso3) {
            System.out.println(mensaje + numero1 + coma + numero2 + coma + numero3 + " es: \n- " + numero3 + coma + numero1 + coma + numero2 + ".");
        
        }else if (caso4) {
                System.out.println(mensaje + numero1 + coma + numero2 + coma + numero3 + " es: \n- " + numero2 + coma + numero3 + coma + numero1 + ".");
            
            } else if (caso5) {
                System.out.println(mensaje + numero1 + coma + numero2 + coma + numero3 + " es: \n- " + numero2 + coma + numero1 + coma + numero3 + ".");
            
        } else if (caso6) {
            System.out.println(mensaje + numero1 + coma + numero2 + coma + numero3 + " es: \n- " + numero3 + coma + numero1 + coma + numero2 + ".");
        
        } else {
            System.out.println(mensaje + numero1 + coma + numero2 + coma + numero3 + " es: \n- " + numero3 + coma + numero2 + coma + numero1 + ".");
        }

        
		}
}
