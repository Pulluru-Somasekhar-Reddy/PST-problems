import java.util.*;

public class Solution {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int d = cal.get(Calendar.DAY_OF_WEEK);

        switch (d) {
            case Calendar.SUNDAY:
                return "SUNDAY";
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(findDay(month, day, year));
    }
}
