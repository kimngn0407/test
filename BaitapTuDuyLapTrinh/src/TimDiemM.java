import java.util.Scanner;
public class TimDiemM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xac dinh toa do diem M");
        System.out.print("Vui long nhap toa do x cua tam duong tron:");
        String xc = sc.nextLine();
        System.out.print("Vui long nhap toa do y cua tam duong tron:");
        String 
        yc = sc.nextLine();
        System.out.print("Vui long nhap ban kinh cua duong tron:");
        String R = sc.nextLine();
        System.out.print("Vui long nhap toa do x cua diem M:");
        String xm = sc.nextLine();
        System.out.print("Vui long nhap toa do y cua diem M:");
        String ym = sc.nextLine();
        float xC = Float.parseFloat(xc);
        float yC = Float.parseFloat(yc);
        float r = Float.parseFloat(R);
        float xM = Float.parseFloat(xm);
        float yM = Float.parseFloat(ym);
        float KC = (float) Math.sqrt(Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2));
        if (KC < r) {
            System.out.println("Diem M nam trong duong tron");
        }
        else if (KC == r){
            System.out.println("Diem M nam tren duong tron");
        }
        else  {
            System.out.println("Diem M nam ngoai duong tron");
        }
    }
}
