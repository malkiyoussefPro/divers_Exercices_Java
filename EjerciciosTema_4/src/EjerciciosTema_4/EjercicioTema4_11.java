package EjerciciosTema_4;

import java.util.Scanner;

public class EjercicioTema4_11 {
    public static void main(String[] args) {

            //Se inicializa la biblioteca.
            Scanner lector = new Scanner(System.in);
            //Pregunta el número.
            System.out.print("¿Qué tabla de multiplicar quieres? ");
            int tabla = lector.nextInt();
            lector.nextLine();
            //El contador servirá para realizar cálculos.
            //En lugar de 'i++' también se podría escribir 'i = i + 1'.
            for (int y = 0; y <= 10; y++) {
                int resultado = tabla*y;
                System.out.println(tabla + " * " + y + " = " + resultado);
            }
            System.out.println("Esta ha sido la tabla del " + tabla);
    }
}
