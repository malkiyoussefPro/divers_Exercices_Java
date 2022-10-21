package EjerciciosTema_4;

import java.util.Scanner;

public class EjercicioTema4_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Introduzca la tabla de multiplicacion: ");
        int numero = scan.nextInt();
        System.out.println("Tabla de multiplicacion del numero: "+numero);
        int iteracion =10;
        while (iteracion>=0){
            System.out.println("- El numero "+numero+" * "+iteracion+ " ="+(numero*iteracion));
            iteracion--;
        }
        System.out.println(" Fin de programa");
    }
}
