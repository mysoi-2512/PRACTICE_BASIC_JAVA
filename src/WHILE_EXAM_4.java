import java.util.Arrays;
import java.util.Scanner;

//Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra số Fibonacci ứng với nó.

public class WHILE_EXAM_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Nhap vao so nguyen <= 20: ");
        n = scanner.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("So Fibonacci tuong ung voi n la: 1");
        } else {
            int[] array = new int[n + 1];
            array[0] = 1;
            array[1] = 1;

            for (int i = 2; i <= n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.println("So Fibonacci tuong ung voi n la: " + array[n]);
        }
    }
}
