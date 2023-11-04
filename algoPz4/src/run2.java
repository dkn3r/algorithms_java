import java.util.ArrayList;
import java.util.Collections;

public class run2 {
    public static void main(String[] args) {
        ArrayList<Rectangle> squares =new ArrayList<>();

        Rectangle rec1 = new Rectangle(3,4);
        Rectangle rec2 = new Rectangle(6,3);
        Rectangle rec3 = new Rectangle(4,7);
        Rectangle rec4 = new Rectangle(15,61);
        Rectangle rec5 = new Rectangle(11,6);

        squares.add(rec1);
        squares.add(rec2);
        squares.add(rec3);
        squares.add(rec4);
        squares.add(rec5);
        System.out.println(squares);
        Collections.sort(squares);
        for (Rectangle square : squares) {
            System.out.println(square);
        }
    }
}
