package ejercicios;

import java.util.Scanner;

public class Operador {

    public static void main (String[] arg) {

        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = lea.nextInt();

        System.out.print("Ingrese el segundo numero, este debe ser menor que el anterior: ");
        int numero2 = lea.nextInt();


        System.out.println("Suma = " + (numero2 + numero1));
        System.out.println("Resta = " + (numero1 - numero2));
        System.out.println("Multiplicacion = " + (numero1 * numero2));
        System.out.println("Division = " + ((((float) numero1)) / (float) numero2));

        // System.out.println("¿Numero 1 es mayor que numero 2?");

        boolean esMayor = numero1 > numero2;
        System.out.println("¿Es mayor? \n" + esMayor);

        boolean esMenor = numero1 < numero2;
        System.out.println("¿Es menor? \n" + esMenor);

        boolean esIgual = numero1 == numero2;
        System.out.println("¿Es igual? \n" + esIgual);

        boolean esDiferente = numero1 != numero2;
        System.out.println("¿Es diferente? \n" + esDiferente);

        boolean correo = true;
        boolean contraseña = true;
        boolean telefono = true;

        boolean ingreso = ( telefono || correo) && contraseña;

        System.out.println("Su ingreso es: " + ingreso);

        // Ejemplo de uso de operadores de asignacion
        int num3 = 2;
        // num3 =  num3 + numero1;
        num3 += numero1;
        System.out.print(+num3);
        // Ejemplo de uso de operadores de asignacion

    }
}
