package notas_clase;

import java.util.Scanner;

public class ifCondicional {

    public static void main (String[] args) {

        Scanner lea = new Scanner(System.in);

        String name = "Carlos";
        String email = "carlos@mail.com";
        String phone = "3147979504";
        int password = 123456;

        System.out.print("Ingrese su usuario: ");
        String user = lea.nextLine();
        System.out.print("Ingrese su contraseña: ");
        int userPassword = lea.nextInt();
        lea.nextLine();

        if ((user.equalsIgnoreCase(email) || user.equalsIgnoreCase(phone)) && userPassword == password) {
            System.out.println("¡Bienvenido " + name + "!");
        } else {
            System.out.println("Usuario o contraseña invalida");
        }
    }
}
