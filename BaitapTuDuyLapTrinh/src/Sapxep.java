import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sapxep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Nhap kich thuoc cua mang A: ");
        int sizeA = scanner.nextInt();
        int[] arrayA = new int[sizeA];
        System.out.println("Nhap cac phan tu cho mang A (hoac nhap -1 de tao ngau nhien):");
        for (int i = 0; i < sizeA; i++) {
            int value = scanner.nextInt();
            if (value == -1) {
                arrayA[i] = random.nextInt(100);
            } else {
                arrayA[i] = value;
            }
        }
        
        System.out.print("Nhap kich thuoc cua mang B: ");
        int sizeB = scanner.nextInt();
        int[] arrayB = new int[sizeB];
        System.out.println("Nhap cac phan tu cho mang B (hoac nhap -1 de tao ngau nhien):");
        for (int i = 0; i < sizeB; i++) {
            int value = scanner.nextInt();
            if (value == -1) {
                arrayB[i] = random.nextInt(100);
            } else {
                arrayB[i] = value;
            }
        }
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int[] mergedArray = new int[sizeA + sizeB];
        int i = 0, j = 0, k = 0;
        
        while (i < sizeA && j < sizeB) {
            if (arrayA[i] <= arrayB[j]) {
                mergedArray[k++] = arrayA[i++];
            } else {
                mergedArray[k++] = arrayB[j++];
            }
        }
        
        while (i < sizeA) {
            mergedArray[k++] = arrayA[i++];
        }
        
        while (j < sizeB) {
            mergedArray[k++] = arrayB[j++];
        }
        
        for (int l = 0; l < mergedArray.length / 2; l++) {
            int temp = mergedArray[l];
            mergedArray[l] = mergedArray[mergedArray.length - l - 1];
            mergedArray[mergedArray.length - l - 1] = temp;
        }
        
        System.out.println("Mang A sau khi sap xep: " + Arrays.toString(arrayA));
        System.out.println("Mang B sau khi sap xep: " + Arrays.toString(arrayB));
        System.out.println("Mang ket qua sau khi tron va sap xep giam dan: " + Arrays.toString(mergedArray));
    }
}
