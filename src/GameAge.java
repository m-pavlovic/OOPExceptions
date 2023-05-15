import javax.management.InvalidAttributeValueException;
import java.util.Scanner;

public class GameAge {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAttributeValueException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    private static void checkAge(int age) throws InvalidAttributeValueException {
        if (age <= 0 || age > 120) {
            System.out.println("Wrong value for age");
            throw new InvalidAttributeValueException("Age cannot be negative or greater than 120");
        } else {
            System.out.println("Age is correct and is: " + age);
        }
    }
}
