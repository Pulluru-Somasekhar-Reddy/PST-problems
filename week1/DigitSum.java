import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Sum even or odd digits? (enter 'even' or 'odd'): ");
        String choice = sc.next();
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            if (choice.equalsIgnoreCase("even") && digit % 2 == 0) {
                sum += digit;
            } else if (choice.equalsIgnoreCase("odd") && digit % 2 != 0) {
                sum += digit;
            }
            temp /= 10;
        }
        System.out.println("Sum of " + choice + " digits of " + num + " is: " + sum);
    }
}