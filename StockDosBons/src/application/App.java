package application;

import java.util.Scanner;
import entities.Hortifruti;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int option, flag = 0;

        System.out.print("Digite o nome da fruta: ");
        String name = input.next();

        System.out.print("Digite o preço da unidade: ");
        double price = input.nextDouble();

        System.out.print("Digite a quantidade em stock: ");
        int quantity = input.nextInt();

        Hortifruti fruit = new Hortifruti(name, price, quantity);

        System.out.print(fruit.toString());

        do {
            info_options();

            System.out.print("\nChoose a option: ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.print(fruit.toString());
                    break;

                case 2:
                    System.out.print("Furniture vai aqui.");
                    break;

                case 3:
                    System.out.print("Eletronics vai aqui.");
                    break;

                case 0:
                    flag = 1;
                    break;

            }
        } while (flag != 1);

        System.out.println("Finalizando!!!");

        input.close();
    }

    public static void info_options() {

        System.out.print("\n     Stock dos Bons");
        System.out.print("\n1 - Hortifruti Listing");
        System.out.print("\n2 - Furniture Listing");
        System.out.print("\n3 - Electronics Listing");
        System.out.print("\n0 - exit");

    }

}
