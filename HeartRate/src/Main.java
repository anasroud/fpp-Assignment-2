import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter your date of birth (yyyy/MM/dd): ");
        String dateOfBirth = input.nextLine();
        HeartRate heartRate = new HeartRate(firstName, lastName, dateOfBirth);
        System.out.println(heartRate);
    }
}