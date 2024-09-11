import java.util.Scanner;

public class SoChanDauTienTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac gia tri cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Cac gia tri co chu so dau tien la so chan:");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (isFirstDigitEven(arr[i])) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Khong co gia tri nao co chu so dau tien la so chan.");
        }
        
        scanner.close();
    }
    
    public static boolean isFirstDigitEven(int number) {
        number = Math.abs(number);
        while (number >= 10) {
            number /= 10;
        }
        return (number % 2 == 0);
    }
}
