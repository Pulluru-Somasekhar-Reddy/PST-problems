import java.util.*;

public class Main {

    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    static int palindromeIndex(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (isPalindrome(s, l + 1, r))
                    return l;
                if (isPalindrome(s, l, r - 1))
                    return r;
                return -1;
            }
            l++;
            r--;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            System.out.println(palindromeIndex(s));
        }
    }
}
