package EjerciciosTema_4;

import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Hasta qué valor quieres ir buscando potencias de dos?");
        int valor = scan.nextInt();
        scan.nextLine();
        //La variable "i" se incrementa multiplicando en lugar de sumante.
        //"i" es el mismo resultado.
        for (int y = 1; y <= valor; y = y*2) {
            System.out.println(y);
        }
    }

}

