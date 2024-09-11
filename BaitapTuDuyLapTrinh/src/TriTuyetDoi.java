import java.util.Random;
import java.util.Scanner;

public class TriTuyetDoi {
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
        double sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > Math.abs(arr[i + 1])) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac gia tri lon hon tri tuyet doi cua gia tri dung lien sau no: " + sum);
        
        scanner.close();
    }
}
