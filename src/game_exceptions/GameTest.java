package game_exceptions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameTest {
    private static Scanner scanner;

    public static void main(String[] args) {
        String filePath = "src/game_exceptions/ageData.txt";
//        Set<Integer> numbers = GAME_CLS.readDataToSetStructure(filePath, scanner);
//        System.out.println(numbers);
//        int random = GAME_CLS.getRandomFromDataStructure(numbers);
//        System.out.println(random);
        GAME_CLS.playGame(scanner, filePath);

    }
}
