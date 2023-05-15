package game_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GAME_CLS {

    public static Set<Integer> readDataToSetStructure(String filePath, Scanner scanner) {
        File file = new File(filePath);
        Set<Integer> numbers = new HashSet<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int value = Integer.parseInt(line);
                    numbers.add(value);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid value: " + line);

                }
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return numbers;

    }

    public static int getRandomFromDataStructure(Set<Integer> numbers) {
        System.out.println(numbers);
        int index = ThreadLocalRandom.current().nextInt(0, numbers.size());
        Integer[] array = numbers.toArray(new Integer[numbers.size()]);
        return array[index];
    }

    public static void playGame(Scanner scanner, String filePath) {
        Set<Integer> numbers = readDataToSetStructure(filePath, scanner);
        scanner = new Scanner(System.in);
        int numToGuess = getRandomFromDataStructure(numbers);
        System.out.println("Please enter your guess: ");
        String guessAsString = scanner.nextLine();
        try {
            Integer guess = Integer.parseInt(guessAsString);
            if (guess == numToGuess) {
                System.out.println("You guessed correctly!");
            } else {
                System.out.println("Your guess: " + guess + " | numToGuess: " + numToGuess);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid value: " + guessAsString);
        }
    }

}
