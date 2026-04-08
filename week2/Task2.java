import java.util.Scanner;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
   public PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }
    public PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }
    public PerformOperation isPalindrome() {
        return n -> {
            int original = n, reverse = 0;
            while (n != 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }
            return original == reverse;
        };
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath math = new MyMath();
        int t = sc.nextInt();
        while (t-- > 0) {
            int choice = sc.nextInt(); 
            int num = sc.nextInt();
            PerformOperation op;
            boolean result;
            switch (choice) {
                case 1 -> {
                    op = math.isOdd();
                    result = op.check(num);
                    System.out.println(result ? "ODD" : "EVEN");
                }
                case 2 -> {
                    op = math.isPrime();
                    result = op.check(num);
                    System.out.println(result ? "PRIME" : "COMPOSITE");
                }
                case 3 -> {
                    op = math.isPalindrome();
                    result = op.check(num);
                    System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}