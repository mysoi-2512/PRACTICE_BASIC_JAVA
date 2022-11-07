import java.util.Scanner;

//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.

public class ARRAY_EXAM_4  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhap vao so nguyen n: ");
        n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.print("Nhap vao so nguyen thu " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }

        int x;
        for (int i = 0; i <= n-2; i++) {

            for (int j = i+1; j <= n - 1; j++) {
                if (array[j] > array[i]){
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
