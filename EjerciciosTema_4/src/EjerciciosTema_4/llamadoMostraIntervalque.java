package EjerciciosTema_4;

import java.util.Scanner;

public class llamadoMostraIntervalque {
    public static void main(String[] args) {
        /*
        Ejercicio 4.12: Haga un programa llamadoMostraIntervalque lea desde el teclado dos valores enteros n1 y n2,
        compruebe que con n1 < n2 (y muestre un error si no es así), y finalmente escriba todos los números enteros
        dentro del intervalo [n1, n2] en orden creciente.
         */

        Scanner scan = new Scanner(System.in);
        //System.out.println("- Indica el tamano de tu tabla: ");
        //int tamanoTabla = scan.nextInt();


        for (int i=0; i<1; i++){
            System.out.print("- Escribe el primer numero: ");
            int numeroUno=scan.nextInt();

            System.out.print("- Escribe el segundo numero: ");
            int numeroDos= scan.nextInt();


            boolean testNumeros =numeroUno<numeroDos;
                if (testNumeros){
                    int numeroInterval = numeroUno;
                    while(numeroInterval<numeroDos){
                    System.out.println("- La operacion es correcta el numero:"+numeroInterval);
                        numeroInterval++;
                      }
                }else{
                    System.out.println("- Error !!!!!");
                }
            }
            System.out.println("- Fin  Programa");
        }
    }

