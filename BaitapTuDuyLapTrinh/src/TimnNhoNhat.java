public class TimnNhoNhat {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (sum <= 100000) {
            n++;
            sum += n;
        }
        System.out.println("So nguyen duong nho nhat n sao cho 1 + 2 + ... + n > 100000 la: " + n);
        System.out.println("Tong la: " + sum);
    }
}
