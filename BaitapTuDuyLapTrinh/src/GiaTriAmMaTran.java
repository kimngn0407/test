import java.util.Random;
import java.util.Scanner;

public class GiaTriAmMaTran {

    public static int nhapDong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        return scanner.nextInt();
    }

    public static int nhapCot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so cot: ");
        return scanner.nextInt();
    }

    public static int[][] nhapMang(int m, int n) {
        Random rand = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(101) - 50;
            }
        }
        return matrix;
    }

    public static void xuatMang(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void lietKeDongAm(int[][] matrix) {
        System.out.println("Cac dong co gia tri am:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.println("Dong " + i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int m = nhapDong();
        int n = nhapCot();
        int[][] matrix = nhapMang(m, n);
        xuatMang(matrix);
        lietKeDongAm(matrix);
    }
}
