public class TimDuongMin {
    public static void main(String[] args) {
        double[] arr = {3.5, -2.1, 0.0, -1.5, 1.9}; // Ví dụ mảng
        int minIndex = -1;
        double minValue = Double.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        System.out.println(minIndex);
    }
}
