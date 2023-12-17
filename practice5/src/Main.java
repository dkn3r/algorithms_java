import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> symbols = new ArrayList<>();
        LinkedList<String> symbols2 = new LinkedList<>();
        int n = 10_000;
        for (int i = 0; i < n; i++) {
            int rand = 1 + (int) (Math.random() * 10);
            String str = "";
            for (int j = 0; j < rand; j++) {
                str += 'a';
            }
            symbols.add(str);
            symbols2.add(str);
        }
        long start_time = System.currentTimeMillis();
        removeEventLengthArr(symbols);
        long end_time = System.currentTimeMillis();
        long result_time = end_time - start_time;


        long start1_time = System.currentTimeMillis();
        removeEventLengthLinked(symbols2);
        long end1_time = System.currentTimeMillis();
        long result1_time = end1_time - start1_time;
        System.out.println(result_time);
        System.out.println(result1_time);
    }

    public static void removeEventLengthArr(ArrayList<String> symbols) {
        int i = 0;
        while (i < symbols.size()) {
            String element = symbols.get(i);
            if (element.length() % 2 == 0) {
                symbols.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void removeEventLengthLinked(LinkedList<String> symbols2) {
        int i = 0;
        while (i < symbols2.size()) {
            String element = symbols2.get(i);
            if (element.length() % 2 == 0){
                symbols2.remove(i);
            }
            else{i++;}
        }

//        Iterator<String> iter = symbols2.iterator();
//        while (iter.hasNext()) {
//            String element = iter.next();
//            if (element.length() % 2 == 0){
//                iter.remove();
//            }
//        }
    }
}