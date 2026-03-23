import java.util.*;

public class Main {

    public static long sumOfSimilarities(String s) {
        int n = s.length();
        int[] z = new int[n];
        
        int left = 0, right = 0;
        
        for (int i = 1; i < n; i++) {
            
            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }
            
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            
            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }
        
        long sum = n;
        
        for (int i = 1; i < n; i++) {
            sum += z[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sumOfSimilarities(s));
        }
        
        sc.close();
    }
}

