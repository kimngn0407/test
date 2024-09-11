import java.util.Scanner;

public class TimSDeQuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double result = sum(n);
        System.out.println(result);
    }

    public static double sum(int n) {
        if (n == 2) {
            return 2.0 / 3;
        }
        return (double) n / (n + 1) + sum(n - 1);
    }
}
