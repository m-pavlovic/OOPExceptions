import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameAge {

    private static Scanner scanner;
    private static ArrayList<Integer> ages = new ArrayList<>();

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ages = new ArrayList<>();
        enterAge();
    }

    private static void enterAge() {
        boolean status = true;
        while (status) {
            System.out.println("Enter your age: ");
            int age = 0;
            try {
                age = scanner.nextInt();
                checkAge(age);
                ages.add(age);
            } catch (InputMismatchException ime) {
                System.out.println("You entered something that is not an integer");
                String scannerOld = scanner.next();
                System.out.println("Memory of the scanner before clearing: " + scannerOld);
            } catch (InvalidAttributeValueException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } finally {
                System.out.println("For new input press y, for exiting the program press any key");
                String cont = scanner.next();
                if (cont.equalsIgnoreCase("y")) {
                    System.out.println("Continuing...");
                } else {
                    System.out.println("Exiting...");
                    status = false;
                }
            }
        }
        calculateAverage(ages);


    }

    private static void checkAge(int age) throws InvalidAttributeValueException {
        if (age <= 0 || age > 120) {
            System.out.println("Wrong value for age");
            throw new InvalidAttributeValueException("Age cannot be negative or greater than 120");
        } else {
            System.out.println("Age is correct and is: " + age);
        }
    }

    private static void calculateAverage(ArrayList<Integer> ages) {
        int sum = 0;
        float avg;
        for (int age : ages) {
            sum += age;
        }
        avg = (float) sum / ages.size();
        System.out.println("Average age is: " + avg);
    }
}
