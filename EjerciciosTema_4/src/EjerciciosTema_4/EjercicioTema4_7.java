package EjerciciosTema_4;

import java.util.Scanner;

public class EjercicioTema4_7 {

        public static void main(String[] args) {
                //Declarar y inicializar el variable de veces
                int iteracion =0;
                Scanner scan = new Scanner(System.in);
                System.out.print("- Escreibe el numero de iteraciones de guillones: ");
                //Introducir por teclado los veces de iteraciones
                int numeroIteracion = scan.nextInt();
                //
                while (iteracion<numeroIteracion){
                        System.out.print("-"+" ");
                        iteracion++;
                }
                System.out.println();
                System.out.println("- Fin de programa");
        }
}
