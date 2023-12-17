import java.util.Set;
import java.util.HashSet;
public class TestHashSet {
    public static void main(String[] args) {
        //create a hash set
        Set<String> set = new HashSet<String>();

        //add strings to the set

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        //display the elements in the hash set
        for (String s: set) {
            System.out.println(s + " ("+s.hashCode()+")");
        }
    }
}