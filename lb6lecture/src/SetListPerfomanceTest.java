import java.util.*;
public class SetListPerfomanceTest {
    static final int N = 50000;

    public static void main(String[] args) {
        //add numbers 0,1,2, ..., N - 1 to array list
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++)
            list.add(i);
        Collections.shuffle(list); //shuffle the array list
        //create a hash set and test its perfomance
        Collection<Integer> set1 = new HashSet<Integer>(list);
        System.out.println("Memeber test time for hash set is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove element time for linked hash set is " + getRemoveTime(set1) + " milliseconds");

        //create a linked hash set, and test its perfpmance
        Collection<Integer>  set2 = new LinkedHashSet<Integer>(list);
        System.out.println("Memeber test time for hash set is " + getTestTime(set2) + " milliseconds");
        System.out.println("Remove element time for linked hash set is " + getRemoveTime(set2) + " milliseconds");

        //create a tree hash set, and test its perfomance
        Collection<Integer> set3= new TreeSet<Integer>(list);
        System.out.println("Memeber test time for hash set is " + getTestTime(set3) + " milliseconds");
        System.out.println("Remove element time for linked hash set is " + getRemoveTime(set3) + " milliseconds");

        //create an array list, and test its perfomance
        Collection<Integer> list1= new ArrayList<Integer>(list);
        System.out.println("Memeber test time for hash set is " + getTestTime(list1) + " milliseconds");
        System.out.println("Remove element time for linked hash set is " + getRemoveTime(list1) + " milliseconds");

        //create an array list, and test its perfomance
        Collection<Integer> list2= new LinkedList<Integer>(list);
        System.out.println("Memeber test time for hash set is " + getTestTime(list2) + " milliseconds");
        System.out.println("Remove element time for linked hash set is " + getRemoveTime(list2) + " milliseconds");


    }
    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();

        //test if a number is in the collection
        for(int i = 0; i < N; i++ )
            c.contains((int) Math.random() * 2 * N);

        return System.currentTimeMillis() - startTime;

    }

    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < N; i++ )
            c.remove(i);

        return System.currentTimeMillis() - startTime;
    }
}
