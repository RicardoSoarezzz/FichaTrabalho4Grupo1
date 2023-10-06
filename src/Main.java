import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ParkingLot park = new ParkingLot();

            System.out.println("Choose one option: ");
            System.out.println("1. Add Ticket ");
            System.out.println("2. Remove Ticket ");
            System.out.println("3. View Ticket ");
            System.out.println("0. Leave Program ");
            System.out.println("Option: ");


            if (op < 0 || op > 4) {
                System.out.println("Choose one option: ");
                System.out.println("1. Add Ticket ");
                System.out.println("2. Remove Ticket ");
                System.out.println("3. View Ticket ");
                System.out.println("0. Leave Program ");
                System.out.println("Option: ");
                op = input.nextInt();
                input.nextLine();
            }
            switch (op) {
                case 1:
                    System.out.println("Ola Manuel");
                    break;
                case 2:
                    System.out.println("Ola Joao");
                    break;
                case 3:
                    System.out.println("Ola Tiago");
                    break;
            }
        }
    }
}