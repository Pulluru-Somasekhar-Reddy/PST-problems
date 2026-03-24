import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

public class Solution {
    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }
    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }
    public static PerformOperation isPalindrome() {
        return (int a) -> {
            String s = String.valueOf(a);
            String rev = new StringBuilder(s).reverse().toString();
            return s.equals(rev);
        };
    }
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int ch = sc.nextInt();
            int num = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println(
                        checker(isOdd(), num) ? "ODD" : "EVEN"
                    );
                    break;

                case 2:
                    System.out.println(
                        checker(isPrime(), num) ? "PRIME" : "COMPOSITE"
                    );
                    break;

                case 3:
                    System.out.println(
                        checker(isPalindrome(), num) ? "PALINDROME" : "NOT PALINDROME"
                    );
                    break;
            }
        }
        sc.close();
    }
}
