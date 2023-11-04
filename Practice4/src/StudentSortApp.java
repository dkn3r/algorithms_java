import java.util.ArrayList;
import java.util.Collections;

public class StudentSortApp {
    public static void main(String[] args) {
        ArrayList<Student> listStd = new ArrayList<>();

        Student s1 = new Student("Alex", 100);
        Student s2 = new Student("Bob", 62);
        Student s3 = new Student("Andrew", 75);
        Student s4 = new Student("Mark", 72);
        Student s5 = new Student("Michael", 63);

        listStd.add(s1);
        listStd.add(s2);
        listStd.add(s3);
        listStd.add(s4);
        listStd.add(s5);

        System.out.println(listStd);
        Collections.sort(listStd);
        for (Student s : listStd) {

            System.out.println(s);
        }



    }
}
