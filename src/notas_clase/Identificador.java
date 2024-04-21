package notas_clase;

import java.util.Scanner;

public class Identificador {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        String[] rostros = {"Carlos", "Humberto", "Jorge"};
        System.out.print("Acerque su rostro: ");
        String studentFace = sc.nextLine().trim();

        if (studentFace.trim().equalsIgnoreCase(rostros[0])) {
            System.out.println("Bienvenido " + studentFace);
        } else {
            System.out.println("Dirijase a la oficina de registro y control");
        }

    }
}
