import java.util.Calendar;
public class Task7 {
    public static String getDay(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY",
            "WEDNESDAY", "THURSDAY",
            "FRIDAY", "SATURDAY"
        };
        return days[dayOfWeek - 1];
    }
}