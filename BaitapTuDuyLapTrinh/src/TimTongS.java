import java.util.Scanner;

public class TimTongS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        int sumOfNumbers = 0;
        for (int i = 1; i <= n; i++) {
            sumOfNumbers += i;
            sum += 1.0 / sumOfNumbers;
        }
        System.out.println(sum);
    }
}

