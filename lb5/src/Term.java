public class Term {
    int coef;
    int exponent;

    public Term(int coef, int exponent) {
        this.coef = coef;
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        if (coef == 0) {
            return "";
        } else if (exponent == 0) {
            return Integer.toString(coef);
        } else if (exponent == 1) {
            return coef + "x";
        } else {
            return coef + "x^" + exponent;
        }
    }
}
