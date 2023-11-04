public class CalendarDate implements Comparable<CalendarDate> {
    private int month;
    private int days;

    public int compareTo(CalendarDate other) {
        if (this.month != other.month) {
            return Integer.compare(other.month, this.month);
        } else {
            return Integer.compare(other.days, this.days);
        }
    }

    CalendarDate(int month, int days) {
        this.month = month;
        this.days = days;
    }

    @Override
    public String toString() {
        return month + "/" + days;
    }


}


