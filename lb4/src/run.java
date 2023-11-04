import java.util.ArrayList;
import java.util.Collections;

public class run {
    public static void main(String[] args) {
        ArrayList<CalendarDate> dates =new ArrayList<>();

        CalendarDate date1 = new CalendarDate(5,25);
        CalendarDate date2 = new CalendarDate(5,14);
        CalendarDate date3 = new CalendarDate(5,12);
        CalendarDate date4 = new CalendarDate(5,15);
        CalendarDate date5 = new CalendarDate(5,24);

        dates.add(date1);
        dates.add(date2);
        dates.add(date3);
        dates.add(date4);
        dates.add(date5);
        System.out.println(dates);
        Collections.sort(dates);
        for (CalendarDate date : dates) {

            System.out.println(date);
        }

    }
}
