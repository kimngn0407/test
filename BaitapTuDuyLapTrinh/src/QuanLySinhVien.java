import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem chuan: ");
        double diemchuan = sc.nextDouble();
        System.out.print("Moi ban nhap diem mon thu nhat:");
        double monthu1 = sc.nextDouble();
        System.out.print("Moi ban nhap diem mon thu hai:");
        double monthu2 = sc.nextDouble();
        System.out.print("Moi ban nhap diem mon thu ba:");
        double monthu3 = sc.nextDouble();
        if(monthu1 == 0 || monthu2 == 0 || monthu3 == 0){
            System.out.println("Thi sinh rot");
            return;
        }
        System.out.print("Nhap diem khu vuc(A, B, C, X):");
        char KV = sc.next().charAt(0);
        double diemKV = 0;
        switch (KV) {
            case 'A':
                diemKV = 2;
                break;
            case 'B':
                diemKV = 1;
                break;
            case 'C':
                diemKV = 0.5;
                break;
            case 'X':
                diemKV = 0;
                break;
            default:
            System.out.println("Khu vuc khong hop le");
                return;
        }

        System.out.print("Nhap doi tuong(1, 2, 3, 0):");
        int DT = sc.nextInt();
        double diemDT = 0;
        switch (DT) {
            case 1:
                diemDT = 2.5;
                break;
            case 2:
                diemDT = 1.5;
                break;
            case 3:
                diemDT = 1;
                break;
            case 0:
                diemDT = 0;
                break;
            default:
            System.out.println("Doi tuong khong hop le");
                return;
        }
        Double DiemUuTien = diemDT + diemKV;
        Double TongDiem = monthu1 + monthu2 + monthu3 + DiemUuTien;
        if(TongDiem > diemchuan){
            System.out.println("Ban da dau voi tong diem: " + TongDiem);
        }
        else {
            System.out.println("Ban da rot voi tong diem: " + TongDiem);
        }
    }
}
