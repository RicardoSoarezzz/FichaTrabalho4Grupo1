import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public void removeS(int id,ArrayList<Student> sl){
        for(int i = 0; i < sl.size();i++){
            if(id == sl.get(i).getId()){
                sl.remove(i);
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>(1000);
        ParkingLot park = new ParkingLot();
        Scanner input =new Scanner(System.in);

        int op = -1;

        while(op != 0){
            System.out.println("Choose one option: ");
            System.out.println("1. Add Ticket ");
            System.out.println("2. Remove Ticket ");
            System.out.println("3. View Ticket ");
            System.out.println("4. Add Student");
            System.out.println("5. Remove Student");
            System.out.println("6. View Student");
            System.out.println("0. Leave Program ");
            System.out.println("Option: ");
            op =input.nextInt();
            input.nextLine();

            if(op < 0 || op > 4){
                System.out.println("Choose one option: ");
                System.out.println("1. Add Ticket ");
                System.out.println("2. Remove Ticket ");
                System.out.println("3. View Ticket ");
                System.out.println("4. Add Student");
                System.out.println("5. Remove Student");
                System.out.println("6. View Student");
                System.out.println("0. Leave Program ");
                System.out.println("Option: ");
                op =input.nextInt();
                input.nextLine();
            }
            switch (op){
                case 1:
                    System.out.println("Ola Manuel");
                    break;
                case 2:
                    System.out.println("Ola Tiago");
                    break;
                case 3:
                    System.out.println("Ola Jorge");
                    break;
                case 4:
                    System.out.println("What is the Student Number ?");
                    int id = input.nextInt();
                    System.out.println("What is the student name ?");
                    String name = input.nextLine();
                    System.out.println("What is the student course ?");
                    String course = input.nextLine();
                    Student novo = new Student(id,name,course);
                    studentList.add(novo);
                    System.out.println(novo.toString());
                    break;
                case 5:
                    System.out.println("What is the Student Number ?");
                    int idS = input.nextInt();
                    removeS(idS,studentList);

            }
        }

    }
}