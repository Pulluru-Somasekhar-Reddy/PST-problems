import java.util.*;

public class Main {

    public static String twoStrings(String s1, String s2) {
        boolean[] freq = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (freq[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(twoStrings(s1, s2));
        }
    }
}
