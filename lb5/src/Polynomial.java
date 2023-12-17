import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Polynomial {
    List<Term> terms;

    public Polynomial() {
        terms = new LinkedList<>();
    }

    public void addTerm(int coef, int exponent) {
        ListIterator<Term> iterator = terms.listIterator();
        while (iterator.hasNext()) {
            Term currentTerm = iterator.next();
            if (currentTerm.exponent == exponent) {
                currentTerm.coef += coef;
                return;
            } else if (currentTerm.exponent < exponent) {
                iterator.previous();
                iterator.add(new Term(coef, exponent));
                return;
            }
        }
        terms.add(new Term(coef, exponent));
    }

    public Polynomial addPoly(Polynomial other) {
        Polynomial result = new Polynomial();
        ListIterator<Term> thisIterator = terms.listIterator();
        ListIterator<Term> otherIterator = other.terms.listIterator();

        while (thisIterator.hasNext() || otherIterator.hasNext()) {
            Term thisTerm = null;
            if (thisIterator.hasNext()) {
                thisTerm = thisIterator.next();
            }

            Term otherTerm = null;
            if (otherIterator.hasNext()) {
                otherTerm = otherIterator.next();
            }

            if (thisTerm == null) {
                result.addTerm(otherTerm.coef, otherTerm.exponent);
            } else if (otherTerm == null) {
                result.addTerm(thisTerm.coef, thisTerm.exponent);
            } else {
                if (thisTerm.exponent > otherTerm.exponent) {
                    result.addTerm(thisTerm.coef, thisTerm.exponent);
                    otherIterator.previous();
                } else if (thisTerm.exponent < otherTerm.exponent) {
                    result.addTerm(otherTerm.coef, otherTerm.exponent);
                    thisIterator.previous();
                } else {
                    int newCoef = thisTerm.coef + otherTerm.coef;
                    result.addTerm(newCoef, thisTerm.exponent);
                }
            }
        }

        return result;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListIterator<Term> iterator = terms.listIterator();
        while (iterator.hasNext()) {
            result.append(iterator.next());
            if (iterator.hasNext()) {
                result.append(" + ");
            }
        }
        return result.toString();
    }
}
