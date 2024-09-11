import java.util.Random;
import java.util.Scanner;

public class MangSoChan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap kich thuoc mang (so chan): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(201) - 100;
        }

        System.out.println("Mang ngau nhien duoc tao: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Nhap gia tri x: ");
        int x = scanner.nextInt();
        System.out.print("Nhap gia tri y: ");
        int y = scanner.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        boolean found = false;
        System.out.println("Cac so chan trong doan [" + x + ", " + y + "] la:");
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x && arr[i] <= y && arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Khong co so chan nao trong doan [" + x + ", " + y + "]");
        }
        
        scanner.close();
    }
}
