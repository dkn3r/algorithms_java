import java.util.ArrayList  ;
import java.util.Arrays;

public class main2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("world", "dog", "cat", "school", "moon", "sun", "cloud"));
        System.out.println("Input: " + words);
        System.out.println("Result: " + reverse(words));
    }

    public static ArrayList<String> reverse(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.add(words.get(i));
        }
        return result;
    }
}