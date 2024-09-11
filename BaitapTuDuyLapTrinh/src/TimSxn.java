import java.util.Scanner;

public class TimSxn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println(sum);
    }
}

