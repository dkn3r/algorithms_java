public class Rectangle implements Comparable<Rectangle> {
    private int sideA;
    private int sideB;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public int square(){
        return sideA * sideB;
    }
    public int compareTo(Rectangle other) {
        if (this.square() < other.square()) {
            return -1;
        } else if (this.square() == other.square()) {
            return 0;
        } else {
            return 1;
        }
    }
    public String toString(){
        return "Square = " + square();
    }
}
