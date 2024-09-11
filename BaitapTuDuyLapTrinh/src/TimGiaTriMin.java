public class TimGiaTriMin {
    public static void main(String[] args) {
        double[] arr = {3.5, 2.1, 5.6, 1.9, 4.2};
        if (arr.length == 0) {
            System.out.println(-1);
            return;
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }
}
