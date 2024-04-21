package notas_clase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // 1. Recomendaciones imc = peso bajo
        // 2. Recomendaciones imc = peso normal
        // 3. Recomendaciones imc = sobrepeso
        // 4. Recomendaciones imc = obesidad

        System.out.println("Seleccione: \n" +
                "1. Peso bajo\n" +
                "2. Peso normal\n" +
                "3. Sobrepeso\n" +
                "4. Obesidad\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una opcion: ");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Recomendaciones medicas para aumentar el IMC");
                break;
            case 2:
                System.out.println("Recomendaciones medicas para mantener el IMC");
                break;
            case 3:
                System.out.println("Recomendaciones medicas para disminuir el IMC por sobrepeso");
                break;
            case 4:
                System.out.println("Recomendaciones medicas para bajar el IMC por obesidad");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
}
