import java.util.Random;
import java.util.Scanner;

public class TinhTongCacSoHangChucLa5 {
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
        int sumOfNumbers = 0;
        int sumOfDigits = 0;
        
        for (int i = 0; i < n; i++) {
            if (hasTensDigitFive(arr[i])) {
                sumOfNumbers += arr[i];
                sumOfDigits += sumDigits(Math.abs(arr[i]));
            }
        }

        System.out.println("Tong cac so co hang chuc la 5: " + sumOfNumbers);
        System.out.println("Tong cac chu so cua cac so co hang chuc la 5: " + sumOfDigits);
        
        scanner.close();
    }

    public static boolean hasTensDigitFive(int number) {
        int tensDigit = Math.abs(number) / 10 % 10;
        return tensDigit == 5;
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
