public class TimNguyenToLast {
    public static void main(String[] args) {
        int[] arr = {10, 15, 7, 8, 23, 4}; // Ví dụ mảng
        int lastPrime = -1;

        // Duyệt từ cuối mảng về đầu
        for (int i = arr.length - 1; i >= 0; i--) {
            if (isPrime(arr[i])) {
                lastPrime = arr[i];
                break;
            }
        }

        System.out.println(lastPrime);
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
