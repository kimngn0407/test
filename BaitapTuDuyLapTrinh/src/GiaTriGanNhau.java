import java.util.Arrays;
import java.util.Scanner;

public class GiaTriGanNhau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int GiaTrinho = Integer.MAX_VALUE;
        for (int i = 0; i < size - 1; i++) {
            int khacnhau = arr[i + 1] - arr[i];
            if (khacnhau < GiaTrinho) {
                GiaTrinho = khacnhau;
            }
        }
        
        System.out.println("Cac cap gia tri gan nhau nhat:");
        for (int i = 0; i < size - 1; i++) {
            if (arr[i + 1] - arr[i] == GiaTrinho) {
                System.out.println("(" + arr[i] + ", " + arr[i + 1] + ")");
            }
        }
        
        scanner.close();
    }
}
