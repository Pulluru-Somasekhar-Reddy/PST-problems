import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of hill: ");
        int n = sc.nextInt();
        int weight = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                weight += j;
            }
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                weight += j;
            }
        }
        System.out.println("Weight of the hill pattern: " + weight);
    }
}