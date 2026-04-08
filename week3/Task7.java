import java.util.Scanner;

class Task7 {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();   
            int count = 0;
            int num = 1;
            while (count < n) {
                num++;
                if (isPrime(num)) {
                    count++;
                }
            }
            System.out.println(num);
        }
    }
}
