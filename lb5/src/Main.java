public class Main {
    public static void main(String[] args) {
        Polynomial poly1 = new Polynomial();
        poly1.addTerm(3, 4);
        poly1.addTerm(2, 4);
        poly1.addTerm(3, 1);
        poly1.addTerm(7, 0);

        Polynomial poly2 = new Polynomial();
        poly2.addTerm(2, 4);
        poly2.addTerm(-5, 1);
        poly2.addTerm(5, 0);

        Polynomial sum = poly1.addPoly(poly2);

        System.out.println("Перший поліном: " + poly1);
        System.out.println("Другий поліном: " + poly2);
        System.out.println("Сума поліномів: " + sum);
    }
}
