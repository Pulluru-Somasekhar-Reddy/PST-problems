import java.util.*;
class Lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();
            int[]  f1= new int[26];
            int[] f2= new int[26];
            for (int i = 0; i < n / 2; i++) {
                f1[s.charAt(i) - 'a']++;
            }
            int start = (n % 2 == 0) ? n / 2 : n / 2 + 1;
            for (int i = start; i < n; i++) {
                f2[s.charAt(i) - 'a']++;
            }
            if (Arrays.equals(f1, f2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

