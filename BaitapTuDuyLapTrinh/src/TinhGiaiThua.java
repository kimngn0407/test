import java.util.Scanner;

public class TinhGiaiThua {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Gia tri n phai la so nguyen khong am.");
            scanner.close();
            return;
        }
        long GiaiThua = 1;

        if (n == 0 || n == 1) {
            GiaiThua = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                GiaiThua *= i;
            }
        }
        System.out.println("Giai thua cua " + n + " la: " + GiaiThua);

        scanner.close();
    }
}
