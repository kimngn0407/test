import java.util.Scanner;

public class LuyThuaCua3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean found = false;
        System.out.println("Cac gia tri co dang 3^k trong mang:");
        for (int num : arr) {
            if (num > 1) {
                int n = num;
                while (n % 3 == 0) {
                    n /= 3;
                }
                if (n == 1) {
                    System.out.print(num + " ");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Khong co gia tri nao co dang 3^k.");
        }
        
        scanner.close();
    }
}
