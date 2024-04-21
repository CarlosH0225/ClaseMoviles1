package notas_clase.poo;

import java.util.Scanner;

public class Product {

    Scanner sc = new Scanner(System.in);

    // Atributos
    /*
    int id;
    String name;
    double price;
    String category;
*/
    int fil = 1;
    int col = 4;
    String[][] arrayProduct = new String[fil][col];


    // Metodos
    public void createProduct() {

        for (int fil = 0; fil < arrayProduct.length; fil++) {
            for (int col = 0; col < 4; col++) {
                switch (col) {
                    case 0:
                        System.out.print("ID: ");
                        arrayProduct[fil][col] = sc.nextLine();
                        sc.nextLine();
                        break;
                    case 1:
                        System.out.print("Nombre: ");
                        arrayProduct[fil][col] = sc.nextLine();
                        break;
                    case 2:
                        System.out.print("Precio: ");
                        arrayProduct[fil][col] = sc.nextLine();
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.print("Categoria: ");
                        arrayProduct[fil][col] = sc.nextLine();
                        break;
                    default:
                        System.out.println("Valor invalido");
                        break;
                }

/*
                System.out.print("Nombre: ");
                //name = sc.nextLine();
                arrayProduct[fil][col] = sc.nextLine();

                System.out.print("Precio: ");
                //price = sc.nextDouble();
                //sc.nextLine();
                arrayProduct[fil][col] = sc.nextLine();

                System.out.print("Categoria: ");
                //category = sc.nextLine();
                arrayProduct[fil][col] = sc.nextLine();
*/
            }
        }
    }

    public void showProducts() {
        for (int fil = 0; fil < arrayProduct.length; fil++) {
            System.out.println("| ID | Nombre | Precio | Categoria |");
            for (int col = 0; col < arrayProduct[fil].length; col++) {
                System.out.print(" | " + arrayProduct[fil][col] + " | ");
            }
            System.out.print("\n");
        }
    }
    public void searchProduct() {

    }

    public void updateProduct() {

    }

    public void deleteProduct() {

    }

}
