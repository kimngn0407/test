import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = {1, 3, 2, 4};
int index = -1;
int x = -4;
int y = 10;
int i = 0;
for (; i < a.length; i++) {
if(a[i] >= x  && a[i] <= y){
index = i;
break;
}
    }
System.out.println("Kết quả: " + index);
    }
}
