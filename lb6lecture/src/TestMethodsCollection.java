import java.util.Set;
import java.util.HashSet;

public class TestMethodsCollection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        // Add strings to the set
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        // Display the elements in the hash set
        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");
        // Delete a string from set1
        set1.remove("London");
        System.out.println("\nse1 is " + set1);
        System.out.println(set1.size() + " elements in set1");
        //Create set 2        
        java.util.Set<String> set2 = new java.util.HashSet<String>();
        //Add strings to set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("\nset1 is " + set2);
        System.out.println(set2.size() + " elements in set2");
        System.out.println("\nIs Taipen in set2 ?" + set2.contains("Taipei"));
        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1 , set1 is " + set1);
        set1.removeAll(set2);
        System.out.println("\nAfter removing set2 from set1 , set1 is " + set1);
        set1.retainAll(set2);
        System.out.println("After removing common elements in set2" + " from set1, set1 is" + set1);
    }
}