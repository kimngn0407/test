import java.util.Random;
import java.util.Scanner;

public class TongLeMaTran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dong: ");
        int m = scanner.nextInt();

        System.o    ut.print("Nhap so cot: ");
        int n = scanner.nextInt();

        Random rand = new Random();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(101) - 50;
            }
        }

        System.out.println("Ma tran:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.print("Nhap cot can tinh tong: ");
        int c = scanner.nextInt();

        if (c >= 0 && c < n) {
            int sum = 0;
            for (int[] row : matrix) {
                if (row[c] % 2 != 0) {
                    sum += row[c];
                }
            }
            System.out.println("Tong gia tri le tren cot " + c + " la: " + sum);
        } else {
            System.out.println("Cot khong hop le.");
        }
    }
}

