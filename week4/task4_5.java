import java.io.*;

class Solution {

    public static String timeConversion(String s) {
        String amPm = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);

        if (amPm.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d%s", hour, rest);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(timeConversion(s));
    }
}
