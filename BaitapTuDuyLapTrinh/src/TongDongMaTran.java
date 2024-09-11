import java.util.Random;
import java.util.Scanner;

public class TongDongMaTran {

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

    public static int tinhTongDong(int[][] matrix, int r) {
        int sum = 0;
        for (int value : matrix[r]) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int m = nhapDong();
        int n = nhapCot();
        int[][] matrix = nhapMang(m, n);
        xuatMang(matrix);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap dong can tinh tong: ");
        int r = scanner.nextInt();

        if (r >= 0 && r < m) {
            int tong = tinhTongDong(matrix, r);
            System.out.println("Tong cua dong " + r + " la: " + tong);
        } else {
            System.out.println("Dong khong hop le.");
        }
    }
}
