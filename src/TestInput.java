import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInput {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter some number that can be considered as a double: ");

            try {
                double d = scanner.nextDouble();
                System.out.println("You entered: " + d);
            } catch (InputMismatchException ime) {
                System.out.println("You entered something that is not a double");
                String scannerOld = scanner.next();
                System.out.println("Memory of the scanner before clearing: " + scannerOld);
            } finally {
                System.out.println("Enter y for continuing or n for exiting the program");
                String cont = scanner.next();
                if (cont.equalsIgnoreCase("y")) {
                    System.out.println("Continuing...");
                } else {
                    System.out.println("Exiting...");
                    break;
                }
            }
        }
    }
}
