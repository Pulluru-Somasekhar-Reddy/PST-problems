import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            num = Math.abs(num);
            while (num != 0) {
                count++;
                num /= 10;
            }
        }
        System.out.println("Total number of digits: " + count);
    }
}