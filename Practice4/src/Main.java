import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(2,-1,3,0,-3,1,-2));
        System.out.println(listInt);
        Collections.sort(listInt);
        System.out.println(listInt);

    }
}
