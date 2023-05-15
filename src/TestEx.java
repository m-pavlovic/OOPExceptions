import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestEx {


    private static Scanner scanner;


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -11, 25, 99};
  //      System.out.println("Element: " + arr[9]);
        String filePath = "src/dataFile.txt";
        readFile(filePath);
    }


    private static void readFile(String filePath) {
        File file = new File(filePath);
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found --> " + file.getName());
        }
        scanner.close();
    }

}
