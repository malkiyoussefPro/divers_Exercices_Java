package EjerciciosTema_4;
import java.util.Scanner;
public class EjercicioTema4_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //PAS 1 y 2
        System.out.print("¿Cual es el dividendo? ");
        int dividendo = scan.nextInt();
        scan.nextLine();
        //PAS 3 y 4
        System.out.print("¿Cual es el divisor? ");
        int divisor = scan.nextInt();
        scan.nextLine();
        //PAS 5
        int resultadoContador=0;
        while (dividendo >= divisor) {
            //PAS 6
            dividendo = dividendo - divisor;
            System.out.println("Bucle: por ahora el dividendo vale " + dividendo + ".");
           resultadoContador++;
            //PAS 7: Simplemente equivale a decir que damos la vuelta al bucle para evaluar la condición
        }
        System.out.println("- El resultado final es " + dividendo + ".\n"+"- El resultado de la division es: "+resultadoContador);
    }
}
