import java.util.Scanner;

public class TinhTong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Gia tri n phai la so nguyen duong lon hon 0.");
            scanner.close();
            return;
        }
        System.out.print("Nhap so thuc x: ");
        double x = scanner.nextDouble();
        double sum = 0;
        double tam = x;

        for (int i = 1; i <= n; i++) {
            sum += tam;
            tam *= x;
        }
        System.out.println("Tong S = " + sum);

        scanner.close();
    }
}
