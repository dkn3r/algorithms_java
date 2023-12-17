import java.util.Date;
public class HashCodeDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Java";
        String s3 = "i";
        String s4 = "love";
        String s5 = "programming";
        System.out.println("String \""+s1+"\" has hash-code " +s1.hashCode());
        System.out.println("String \""+s2+"\" has hash-code " +s2.hashCode());
        System.out.println("String \""+s3+"\" has hash-code " +s3.hashCode());
        System.out.println("String \""+s4+"\" has hash-code " +s4.hashCode());
        System.out.println("String \""+s5+"\" has hash-code " +s5.hashCode());

        Integer i1=5;
        Double d1=3.14;
        System.out.println("value "+i1+" has hash-code "+i1.hashCode());
        System.out.println("value "+d1+" has hash-code "+d1.hashCode());

        Date date1=new Date();
        System.out.println("Date "+date1.toString()+" has hash-code "+date1.hashCode());
    }
}