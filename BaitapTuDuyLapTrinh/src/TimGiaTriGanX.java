import java.util.Scanner;

public class TimGiaTriGanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri x: ");
        double x = scanner.nextDouble();
        double[] arr = {1.5, 3.7, 2.4, 6.9, 5.1};
        
        if (arr.length == 0) {
            System.out.println("Mang rong.");
            return;
        }
        double closestValue = arr[0];
        double minDifference = Math.abs(arr[0] - x);
        
        for (int i = 1; i < arr.length; i++) {
            double currentDifference = Math.abs(arr[i] - x);
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                closestValue = arr[i];
            }
        }
        
        // In giá trị gần nhất
        System.out.println("Gia tri gan x nhat la: " + closestValue);
        
        scanner.close();
    }
}

