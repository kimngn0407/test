import java.util.Random;
import java.util.Scanner;

public class MangSoLe {
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
        System.out.println("Cac gia tri co toan chu so le la:");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (hasAllOddDigits(arr[i])) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Khong co gia tri nao co toan chu so le.");
        }
        
        scanner.close();
    }
    public static boolean hasAllOddDigits(int number) {
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
