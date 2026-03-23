import java.util.Scanner;

public class Main {

    public static int alternatingCharacters(String s) {
        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        return deletions;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            System.out.println(alternatingCharacters(s));
        }
    }
}
