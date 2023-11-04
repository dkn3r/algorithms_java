public class Student implements Comparable<Student> {
    private String name;
    private int rating;
    public int compareTo(Student other){
        if (this.rating > other.rating){
            return -1;
        }
        else if(this.rating == other.rating){
            return 0;
        }
        else{
            return 1;
        }
    }
    Student(String name, int r) {
        rating = r;
        this.name = name;
    }
    @Override
    public String toString(){
        return name + ": " + rating;
    }
}
