import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "C":
                    System.out.println("Enter the radius of the Circle");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.printf("The area of Circle is: %.2f%n", circle.computeArea());
                    break;
                case "R":
                    System.out.println("Enter the width of the Rectangle");
                    double width = scanner.nextDouble();
                    System.out.println("Enter the height of the Rectangle");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.printf("The area of Rectangle is: %.2f%n", rectangle.computeArea());
                    break;
                case "T":
                    System.out.println("Enter the base of the Triangle");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the Triangle");
                    double triangleHeight = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, triangleHeight);
                    System.out.printf("The area of Triangle is: %.2f%n", triangle.computeArea());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Do you want to continue(y/n) : ");
            continueLoop = scanner.next().equalsIgnoreCase("y");
            scanner.nextLine(); // consume the newline character
        }

        scanner.close();
    }
}