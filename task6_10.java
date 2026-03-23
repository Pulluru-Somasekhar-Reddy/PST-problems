import java.util.*;

public class Main {

    static int manacher(String s) {
        StringBuilder t = new StringBuilder("@");
        for(char c : s.toCharArray()){
            t.append("#").append(c);
        }
        t.append("#$");

        char[] arr = t.toString().toCharArray();
        int[] p = new int[arr.length];
        int center = 0, right = 0, maxLen = 0;

        for(int i = 1; i < arr.length-1; i++){
            int mirror = 2*center - i;

            if(i < right)
                p[i] = Math.min(right-i, p[mirror]);

            while(arr[i + (1 + p[i])] == arr[i - (1 + p[i])])
                p[i]++;

            if(i + p[i] > right){
                center = i;
                right = i + p[i];
            }

            maxLen = Math.max(maxLen, p[i]);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String doubled = s + s;

        for(int i = 0; i < n; i++){
            String rot = doubled.substring(i, i + n);
            System.out.println(manacher(rot));
        }
    }
}
