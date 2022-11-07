import java.util.Scanner;

//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
//Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.

public class ARRAY_EXAM_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhap vao so nguyen n: ");
        n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao so nguyen thu " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }

        int MAX = array[0];
        for (int i = 1; i < n ; i++) {
            if (MAX < array[i]){
                MAX = array[i];
            }
        }
        System.out.println("Phan tu co gia tri lon nhat trong mang la: " + MAX);
    }
}
