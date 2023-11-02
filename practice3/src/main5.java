import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        File file = new File("src/input.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                Integer number = reader.nextInt();
                numbers.add(number);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("File is absent!");
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println("Input: " + numbers);
        System.out.println();

        System.out.println("Task1");
        System.out.println("Average in list numbers: " + sum / numbers.size());
        System.out.println();

        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (maxNumber < numbers.get(i)) {
                maxNumber = numbers.get(i);
            }
            if (minNumber > numbers.get(i)) {
                minNumber = numbers.get(i);
            }
        }
        System.out.println("Task2");
        System.out.println("Minimum number in list numbers: " + minNumber);
        System.out.println("Maximum number in list numbers: " + maxNumber);
        System.out.println();

        System.out.println("Task3");
        System.out.print("Even numbers in list: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }

        }
    }
}