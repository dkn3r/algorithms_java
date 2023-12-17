public class CalendarDate implements Comparable<CalendarDate> {
    private int month;
    private int days;

    public int compareTo(CalendarDate other) {
        if (this.month != other.month) {
            if (this.month < other.month) {
                return -1;
            } else {
                return 1;
            }
        } else {
            if (this.days < other.days) {
                return -1;
            } else if (this.days == other.days) {
                return 0;
            } else {
                return 1;
            }
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


