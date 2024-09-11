import java.util.Scanner;

public class TimSDeQuy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double result = calculateR(n);
        System.out.println(result);
    }

    public static double calculateR(int n) {
        if (n == 1) {
            return Math.sqrt(1);
        }
        return Math.sqrt(n + calculateR(n - 1));
    }
}

