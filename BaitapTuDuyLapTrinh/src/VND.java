package BaitapTuDuyLapTrinh.src;


import java.util.Scanner;
public class VND {
    private static final double tygia = 23.500;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double USD; 
        double VND = 0;
        System.out.println("Doi tien USD => VND");
        System.out.print("Vui long nhap so USD can doi:");
        USD = Integer.parseInt(sc.nextLine());
        VND = USD * tygia;
        System.out.println("So VND sau khi doi la:" + VND);
    }
}

