package application;

import java.util.Scanner;
import entities.Hortifruti;
import entities.Electronics;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da fruta: ");
        String name = input.next();

        System.out.print("Digite o preço da unidade: ");
        double price = input.nextDouble();

        System.out.print("Digite a quantidade em stock: ");
        int quantity = input.nextInt();

        Hortifruti fruit = new Hortifruti(name, price, quantity);

        System.out.print(fruit.toString());

        
        System.out.print("Digite o nome do eletrônico: ");
        String nameE = input.next();

        System.out.print("Digite a marca: ");
        String mark = input.next();

        System.out.print("Digite o preço: ");
        double priceE = input.nextDouble();

        System.out.print("Digite o fabricante: ");
        String fabricator = input.next();
        
        System.out.print("Digite o modelo: ");
        String model = input.next();

        System.out.print("Digite o ano de lançamento: ");
        int yearLaunch = input.nextInt();

        Electronics electronic = new Electronics(nameE, mark, priceE, fabricator, model, yearLaunch);

        System.out.print(electronic.toString());
    }
}
