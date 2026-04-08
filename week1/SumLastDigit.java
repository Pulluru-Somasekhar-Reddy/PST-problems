import java.util.Scanner;
public class SumLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int lastDigitSum = (num1 % 10) + (num2 % 10);
        System.out.println("Sum of last digits: " + lastDigitSum);
    }
}