package EjerciciosTema_4;

import java.util.Scanner;

public class EjercicioTema4_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorUsuario = 0;
        /*
            Ejercicio 4.10:aplique esta comprobación al ejercicio de cuántos días tiene un mes,
            controlando que el número de mes esté entre 1 y 12.
         */
        do {
            //PAS 1 y 2: Al menos, seguro que se pregunta una vez.
            System.out.print("Introduce un valor entero entre 1 y 12: ");
            valorUsuario = scan.nextInt();
            scan.nextLine();
            //PAS 3: Sólo tiene sentido evaluar si 'valor' es válido una vez se ha leído.
        } while ((valorUsuario < 1) || (valorUsuario > 12));
        //PAS 4: Todo correcto

        System.out.println("Dato correcto. Has escrito " + valorUsuario);
        if (valorUsuario ==1){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Enero.");
        }else if (valorUsuario ==2){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Febrero.");
        }else if (valorUsuario ==3){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Marzo.");
        }else if (valorUsuario ==4){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Abril.");
        }else if (valorUsuario ==5){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Mayo.");
        }else if (valorUsuario ==6){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Junio.");
        }else if (valorUsuario ==7){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Julio.");
        }else if (valorUsuario ==8){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Agosto.");
        }else if (valorUsuario ==9){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Septiembre.");
        }else if (valorUsuario ==10){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Octubre.");
        }else if (valorUsuario ==11){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Noviembre.");
        }else if (valorUsuario ==12){
            System.out.println("- El numero: "+valorUsuario+" coresponde al mes de Diciembre.");
        }else {
            System.out.println("- El numero introducido no corresponde a ningun mes del ano.");
        }
    }
}