package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Electronics;
import entities.Furniture;
import entities.Hortifruti;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int option, flag = 0;

        List<Electronics> electronicList = new ArrayList<>();
        List<Furniture> furnitureList = new ArrayList<>();
        List<Hortifruti> hortiList = new ArrayList<>();

        electronicList.add(new Electronics("galax A21s", 1200.00, 11, "Samsung", "Samsung", "A21s", 2020));
        electronicList.add(new Electronics("Smart TV Philco 43”", 1387.15, 5, "Philco", "Philco", "099433039", 2024));
        furnitureList.add(new Furniture("Sofa", 1500.00, 5, 1.50, 2.00, "Wood", 10));
        furnitureList.add(new Furniture("Cadeira", 350.99, 8, 55.00, 42.50,"Plástico e Metal", 2023));
        hortiList.add(new Hortifruti("Banana", 5.00, 35, 100));
        hortiList.add(new Hortifruti("Maça", 3.99, 30, 110));

        do{
            info_options();

            System.out.print("\nChoose a option: ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    for(Hortifruti hort : hortiList){
                        hort.exhibitionProductsData();
                    }
                    break;
                case 2:
                    for(Furniture furn : furnitureList){
                        furn.exhibitionProductsData();
                    }
                    break;
                case 3:
                    for(Electronics elec : electronicList){
                        elec.exhibitionProductsData();
                    }
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
