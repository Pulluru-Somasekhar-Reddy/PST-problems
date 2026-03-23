import java.io.*;
import java.util.*;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr.get(i).get(i);
            secondarySum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primarySum - secondarySum);
    }
}

public class task4_7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().trim().split(" ");
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(row[j]));
            }
            arr.add(list);
        }

        int result = Result.diagonalDifference(arr);
        System.out.println(result);
    }
}
