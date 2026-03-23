import java.util.*;

class Solution {

    static int[] maxSubarray(int[] arr) {

        int currentMax = arr[0];
        int maxSubarray = arr[0];

        int maxSubsequence = 0;
        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {

            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSubarray = Math.max(maxSubarray, currentMax);
        }

        for (int num : arr) {
            if (num > 0)
                maxSubsequence += num;

            maxElement = Math.max(maxElement, num);
        }

        if (maxSubsequence == 0)
            maxSubsequence = maxElement;

        return new int[]{maxSubarray, maxSubsequence};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] result = maxSubarray(arr);
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
