import java.util.Scanner;

public class TrungBinh {
    private static final int N = 5;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        int sum = 0;
        double TBC;
        System.out.println("Tinh trung binh 5 so nhap");
        System.out.print("Vui long nhap so thu nhat:");
        n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Vui long nhap so thu hai:");
        n2 = Integer.parseInt(sc.nextLine());
        System.out.print("Vui long nhap so thu ba:");
        n3 = Integer.parseInt(sc.nextLine());
        System.out.print("Vui long nhap so thu tu:");
        n4 = Integer.parseInt(sc.nextLine());
        System.out.print("Vui long nhap so thu nam:");
        n5 = Integer.parseInt(sc.nextLine());
        sum = n1 + n2 + n3 + n4 + n5;
        TBC = sum / 5;
        System.out.println("Trung binh cong cua 5 so la:" + TBC);
    }
}

