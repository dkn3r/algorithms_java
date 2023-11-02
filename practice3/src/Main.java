import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        System.out.println("Result: " + intersect(list1, list2));
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) < list2.get(j)) {
                    break;
                }
                else if (list1.get(i) == list2.get(j)) {
                    result.add(list1.get(i));
                }

            }

        }

        return result;
    }
}
