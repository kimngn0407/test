import java.util.Scanner;

public class kiemtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++ ){
        for (int j = 0; j < i; j++){
            System.out.print(i + "" + j + ",");
        }
    }
}
}
