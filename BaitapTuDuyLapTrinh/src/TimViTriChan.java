public class TimViTriChan {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 14, 15}; // Ví dụ mảng
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                position = i;
                break;
            }
        }

        System.out.println(position);
    }
}

