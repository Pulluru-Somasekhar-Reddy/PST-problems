import java.util.*;

public class task4_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        matrixRotation(matrix, r);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void matrixRotation(int[][] matrix, int r) {

        int m = matrix.length;
        int n = matrix[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            int size = 2 * (bottom - top + right - left);
            int rotations = r % size;

            int[] arr = new int[size];
            int index = 0;

            for (int j = left; j <= right; j++)
                arr[index++] = matrix[top][j];

            for (int i = top + 1; i <= bottom - 1; i++)
                arr[index++] = matrix[i][right];

            for (int j = right; j >= left; j--)
                arr[index++] = matrix[bottom][j];

            for (int i = bottom - 1; i >= top + 1; i--)
                arr[index++] = matrix[i][left];

            int[] rotated = new int[size];
            for (int i = 0; i < size; i++)
                rotated[i] = arr[(i + rotations) % size];

            index = 0;

            for (int j = left; j <= right; j++)
                matrix[top][j] = rotated[index++];

            for (int i = top + 1; i <= bottom - 1; i++)
                matrix[i][right] = rotated[index++];

            for (int j = right; j >= left; j--)
                matrix[bottom][j] = rotated[index++];

            for (int i = bottom - 1; i >= top + 1; i--)
                matrix[i][left] = rotated[index++];
        }
    }
}
