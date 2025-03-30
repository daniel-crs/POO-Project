package application;

import java.util.Scanner;
import entities.Hortifruti;
import entities.Electronics;
import entities.Furniture;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int option, flag = 0;

        Electronics myElectronic = new Electronics();

        Furniture myFurniture = new Furniture();
        
        Hortifruti myHortifruti = new Hortifruti("Banana", 5.00, 30, 100);

        myElectronic.setName("galax A21s");
        myElectronic.setPrice(1200.00);
        myElectronic.setQuantity(11);
        myElectronic.setMark("Samsung");
        myElectronic.setFabricator("Samsung");
        myElectronic.setModel("A21s");
        myElectronic.setYearLaunch(2020);
        myElectronic.exhibitionProductsData();
        
        do {
            info_options();

            System.out.print("\nChoose a option: ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    myHortifruti.exhibitionHortifruti();
                    break;

                case 2:
                    break;

                case 3:
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
