package application;

import entities.Electronics;
import entities.Furniture;
import entities.Hortifruti;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int option, flag = 0;

        Electronics myElectronic = new Electronics("galaxy A21s",1200.00,11,"Samsung","Samsung","A21s",2020);

        Furniture myFurniture = new Furniture("guarda-roupa",330.34,4,4.0,2.5,"madeira",10);
        
        Hortifruti myHortifruti = new Hortifruti("Banana", 5.00, 30, 100);


        do {
            info_options();

            System.out.print("\nChoose a option: ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    myHortifruti.exhibitionHortifruti();
                    break;
                case 2:
                    myFurniture.exhibitionProductsData();
                    break;
                case 3:
                    myElectronic.exhibitionProductsData();
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
