import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5];
        long totalSum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
            totalSum += arr[i];
        }
        long min = arr[0];
        long max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        long minSum = totalSum - max;
        long maxSum = totalSum - min;
        System.out.println(minSum + " " + maxSum);
    }
}