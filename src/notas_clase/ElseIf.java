package notas_clase;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        // imc = 18 o menos -> peso bajo
        // imc es mayor a 18 y menor a 25 -> peso normal
        // imc es igual a 25 y menor que 30 -> sobrepeso
        // imc mayor igual a 30 -> obesidad

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su peso: " );
        double peso =sc.nextDouble();
        System.out.print("Ingrese su estatura: ");
        double estatura = sc.nextDouble();

        double imc = Math.round(peso/(estatura * estatura));

        if (imc < 18) {
            System.out.println("Su IMC corresponde a peso bajo");
        } else if(imc > 18 && imc < 25 ) {
            System.out.println("Su IMC corresponde a peso normal");
        } else if(imc > 25 && imc < 30 ) {
            System.out.println("Su IMC corresponde a sobrepeso");
        } else if(imc > 30) {
            System.out.println("Su IMC corresponde a obesidad");
        }

    }

}
