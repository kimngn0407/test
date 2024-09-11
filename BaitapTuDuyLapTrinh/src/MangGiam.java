import java.util.Scanner;

public class MangGiam {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int rows = nhapDong();
        int cols = nhapCot();
        int[][] matrix = nhapMang(rows, cols);
        xuatMang(matrix);
        System.out.print("Nhap chi so cot can kiem tra (bat dau tu 0): ");
        int cot = scanner.nextInt();
        if (cot >= 0 && cot < cols) {
            boolean giamDan = kiemTraCotGiamDan(matrix, cot);
            if (giamDan) {
                System.out.println("Cot " + cot + " giam dan.");
            } else {
                System.out.println("Cot " + cot + " khong giam dan.");
            }
        } else {
            System.out.println("Chi so cot khong hop le.");
        }
    }
    
    static int nhapDong() {
        System.out.print("Nhap so dong: ");
        return scanner.nextInt();
    }
    
    static int nhapCot() {
        System.out.print("Nhap so cot: ");
        return scanner.nextInt();
    }
    
    static int[][] nhapMang(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    
    static void xuatMang(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
    static boolean kiemTraCotGiamDan(int[][] matrix, int cot) {
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][cot] >= matrix[i - 1][cot]) {
                return false;
            }
        }
        return true;
    }
}

