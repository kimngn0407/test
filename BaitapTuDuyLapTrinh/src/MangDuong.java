import java.util.Scanner;

public class MangDuong {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int rows = nhapDong();
        int cols = nhapCot();
        int[][] matrix = nhapMang(rows, cols);
        xuatMang(matrix);
        boolean toanSoDuong = kiemTraToanSoDuong(matrix);
        if (toanSoDuong) {
            System.out.println("Ma tran co toan so duong.");
        } else {
            System.out.println("Ma tran khong co toan so duong.");
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
    
    static boolean kiemTraToanSoDuong(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
