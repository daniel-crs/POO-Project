package application;

import java.util.Scanner;
import entities.Hortifruti;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da fruta: ");
        String name = input.next();

        System.out.print("Digite o preço por kg: ");
        double pricePerKilo = input.nextDouble();

        System.out.print("Digite a quantidade em stock: ");
        int quantity = input.nextInt();

        Hortifruti fruit = new Hortifruti(name, pricePerKilo, quantity);

        System.out.println("Quantidade: " + fruit.getQuantity());
    }
}
