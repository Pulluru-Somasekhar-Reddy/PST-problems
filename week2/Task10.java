import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();   // Read as String
        int totalSum = 0;
        for (int i = 0; i < num.length(); i++) {
            int currentSum = 0;
            for (int j = i; j < num.length(); j++) {
                currentSum += num.charAt(j) - '0';
            }
            totalSum += currentSum;
        }
        System.out.println("Sum of sums of digits in cyclic order: " + totalSum);
    }
}