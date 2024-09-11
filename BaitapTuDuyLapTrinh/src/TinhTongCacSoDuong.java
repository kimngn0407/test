import java.util.Random;
import java.util.Scanner;

public class TinhTongCacSoDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(2001) - 1000;
        }
        System.out.println("Mang ngau nhien duoc tao: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac gia tri duong trong mang la: " + sum);
        
        scanner.close();
    }
}

