import java.util.Scanner;

public class Task1101 {
    public static Scanner sc = new Scanner(System.in);

    public static void spiral(int[][] arr) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = arr.length - 1;
        int colEnd = arr[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Top

            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;

            // Right

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;

            // Botom

            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(arr[rowEnd][i] + " ");
            }
            rowEnd--;

            // Left

            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");
            }
            colStart++;
        }
    }

    public static void print(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                if (j < 10) {
                    System.out.print("0");
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

        print(arr);
        System.out.println();
        spiral(arr);
    }
}
