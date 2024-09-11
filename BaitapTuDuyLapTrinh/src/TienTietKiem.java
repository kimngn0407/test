import java.util.Scanner;

public class TienTietKiem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien ban dau: ");
        double TienBanDau = scanner.nextDouble();
        System.out.print("Nhap so tien muc tieu: ");
        double TienMucTieu = scanner.nextDouble();

        System.out.print("Nhap lai suat hang nam (phan tram): ");
        double LaiSuat = scanner.nextDouble();
        LaiSuat = LaiSuat / 100;
        int years = 0;
        double currentAmount = TienBanDau;

        while (currentAmount < TienMucTieu) {
            currentAmount += currentAmount * LaiSuat;
            years++;
        }
        System.out.println("Anh X can cho it nhat " + years + " nam de dat duoc so tien muc tieu.");

        scanner.close();
    }
}

