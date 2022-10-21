package EjerciciosTema_4;

import java.util.Scanner;

public class TablaMultiplicarN {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("¿Hasta qué tabla de multiplicar quieres conocer? ");
        int tablas = lector.nextInt();
        lector.nextLine();
        //Bucle de primer nivel: inicio del bucle que genera N tablas de multiplicar.
        for(int i = 1; i <= tablas; i++) {
            System.out.println("La tabla del " + i);
            //Bucle de segundo nivel: inicio del bucle que genera una tabla concreta.
            for(int j = 1; j <= 10; j++) {
                int resultado = i*j;
                System.out.println(i + " * " + j + " = " + resultado);
            }
            //Fin del bucle que genera una tabla concreta.
            System.out.println("----------");
        }
        //Fin del bucle que genera N tablas de multiplicar.
    }
}
