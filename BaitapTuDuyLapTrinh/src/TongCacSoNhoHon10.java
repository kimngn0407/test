import java.util.Scanner;

public class TongCacSoNhoHon10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.print("Nhap so nguyen duong lon hon 0:");
        n = sc.nextInt();
        if(n < 0){
            System.out.println("Vui long nhap lai.");
        }
        else {
        for (int i = 0; i < n; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("Tong cac so be hon " + n + " la: " + sum);
        }
    }
}
