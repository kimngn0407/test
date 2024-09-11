import java.util.Random;
import java.util.Scanner;

public class TongSoNguyenTo {
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
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
                count++;
            }
        }
        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("Trung binh cong cac so nguyen to trong mang la: " + average);
        
        scanner.close();
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}

