package EjerciciosTema_4;

import java.util.Scanner;
public class llamadoDibujaTriánguloque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("- escribe un numero: ");
        int estrellasTringulo= scan.nextInt();

        for (int i= 0; i<estrellasTringulo; i++){
            for (int j=0; j<i; j++){
                System.out.print(" a ");

            }
            System.out.println();
        }
    }
}
