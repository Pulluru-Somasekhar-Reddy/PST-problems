import java.util.Scanner;
public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int a = 0, b = 1, fib = 0;
        switch (n) {
            case 1 -> fib = a;
            case 2 -> fib = b;
            default -> {
                for (int i = 3; i <= n; i++) {
                    fib = a + b;
                    a = b;
                    b = fib;
                }
            }
        }
        System.out.println("Nth Fibonacci number is: " + fib);
    }
}