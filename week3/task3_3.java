import java.util.*;
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        if (a.score != b.score) {
            return b.score - a.score;
        }

        return a.name.compareTo(b.name);
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            players[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(players, checker);

        for (Player p : players) {
            System.out.printf("%s %d\n", p.name, p.score);
        }
    }
}
