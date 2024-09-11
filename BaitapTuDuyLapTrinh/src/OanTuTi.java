import java.util.Random;
import java.util.Scanner;

public class OanTuTi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int nguoithang = 0;
        int maythang = 0;
        String[] rps = {"Kim", "Bao", "Keo"};

        while (true) {
            System.out.println("1. Kim");
            System.out.println("2. Bao");
            System.out.println("3. Keo");
            System.out.println("0. Nghi choi");
            System.out.print("Lua chon cua ban: ");

            int nguoichon = sc.nextInt();
            if (nguoichon == 0) {
                break;
            }

            if (nguoichon < 1 || nguoichon > 3) {
                System.out.println("Lua chon khong hop le. Vui long thu lai.");
                continue;
            }

            String nguoidichuyen = rps[nguoichon - 1];
            int may = random.nextInt(3);
            String maydichuyen = rps[may];

            System.out.println("Hai ben cung chon " + nguoidichuyen);
            System.out.println("==========================");

            if (nguoidichuyen.equals(maydichuyen)) {
                System.out.println("Hai ben cung chon " + nguoidichuyen);
            } else if ((nguoidichuyen.equals("Keo") && maydichuyen.equals("Bao")) ||
                       (nguoidichuyen.equals("Kim") && maydichuyen.equals("Keo")) ||
                       (nguoidichuyen.equals("Bao") && maydichuyen.equals("Kim"))) {
                System.out.println("Nguoi choi chon " + nguoidichuyen);
                System.out.println("AI chon " + maydichuyen);
                System.out.println("Nguoi choi thang");
                nguoithang++;
            } else {
                System.out.println("Nguoi choi chon " + nguoidichuyen);
                System.out.println("AI chon " + maydichuyen);
                System.out.println("AI thang!");
                maythang++;
            }

            System.out.println("==========================");
        }

        System.out.println("Nguoi choi thang nhieu nhat");
        System.out.println("Ty so la: Người choi: " + nguoithang + " ---- AI: " + maythang);

        sc.close();
    }
}
