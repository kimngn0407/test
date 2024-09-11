import java.util.Random;
import java.util.Scanner;

public class TrungBinhCongHonx {
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
        System.out.print("Nhap gia tri x: ");
        int x = scanner.nextInt();
        double sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                sum += arr[i];
                count++;
            }
        }
        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("Trung binh cong cac gia tri lon hon " + x + " trong mang la: " + average);
        
        scanner.close();
    }
}
