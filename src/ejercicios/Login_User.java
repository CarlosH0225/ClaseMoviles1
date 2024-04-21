package ejercicios;

import java.util.Scanner;

public class Login_User {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String WELCOME_MESSAGE = "Bienvenido!\n";
        final String USER_SAVE = "administrador";
        final String PASS_SAVE = "admin";
        String user = "", pass = "";
        boolean session = false;
        int option;
        int attempts = 1;
        double imc = 0;


        while (attempts <= 3) {

            if (!session) {

                System.out.print("Digite su usuario: ");
                user = sc.nextLine();
                System.out.print("Digite su contraseña: ");
                pass = sc.nextLine();
                attempts = 0;
            }

            if (USER_SAVE.equalsIgnoreCase(user) && PASS_SAVE.equalsIgnoreCase(pass)) {
                session = true;
                System.out.println(WELCOME_MESSAGE + "Sr. " + USER_SAVE);

                System.out.println("Seleccione una de las opciones: \n" +
                        "1. Calcular IMC.\n" +
                        "2. Conocer el nivel de IMC.\n" +
                        "3. Recomendaciones.\n" +
                        "0. Salir\n");

                option = sc.nextInt();
                do {

                    switch (option) {

                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            // Calcular el IMC.
                            System.out.print("Ingrese su peso en kilogramos: " );
                            double weight = sc.nextDouble();
                            System.out.print("Ingrese su estatura en metros: ");
                            double height = sc.nextDouble();
                            /*
                            String heightString = sc.next();
                            if (heightString.contains(".")) {
                                System.out.println("heightString -> " + heightString);
                                String auxString = heightString.replace(".", ",");
                                System.out.println("auxString -> " + auxString);

                                height = Double.parseDouble(auxString.trim());
                                System.out.println("Height -> " + height);
                            } else {
                                System.out.println("heightString -> " + heightString);
                                height = Double.parseDouble(heightString);
                            }
                            */
                            //double imc = Math.round(peso/(estatura * estatura));
                            imc = Math.round(weight/Math.pow(height, 2));
                            System.out.println("Su IMC es " + imc);

                            break;
                        case 2:
                            // Validar el rango del IMC.
                            if (imc < 18) {
                                System.out.println("Su IMC corresponde a bajo peso");
                            } else if(imc > 18 && imc < 25 ) {
                                System.out.println("Su IMC corresponde a peso saludable");
                            } else if(imc > 25 && imc < 30 ) {
                                System.out.println("Su IMC corresponde a sobrepeso");
                            } else if(imc > 30) {
                                System.out.println("Su IMC corresponde a obesidad");
                            }
                            break;
                        case 3:
                            System.out.println("Seleccione sus recomendaciones: \n" +
                                    "1. Peso bajo\n" +
                                    "2. Peso saludable\n" +
                                    "3. Sobrepeso\n" +
                                    "4. Obesidad\n");
                            option = sc.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("Recomendaciones medicas para aumentar el IMC.");
                                    break;
                                case 2:
                                    System.out.println("Recomendaciones medicas para mantener el IMC.");
                                    break;
                                case 3:
                                    System.out.println("Recomendaciones medicas para disminuir el IMC por sobrepeso.");
                                    break;
                                case 4:
                                    System.out.println("Recomendaciones medicas para bajar el IMC por obesidad.");
                                    break;
                                default:
                                    System.out.println("Opcion invalida.");
                                    break;
                            }

                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }

                }while (option == 0 );

            } else {
                System.out.println("Usuario y/o contraseña incorrecta, favor intente nuevamente.");
                System.out.println("Intento: " + attempts);
                attempts ++;
            }
        }

    }
}
