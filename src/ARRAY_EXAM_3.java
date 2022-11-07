import java.util.Scanner;

//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
//Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.

public class ARRAY_EXAM_3 {
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

        int MIN = array[0];
        for (int i = 1; i < n; i++) {
            if (MIN > array[i]){
                MIN = array[i];
            }
        }

        System.out.print("Phan tu co gia tri nho nhat la: " + MIN);
    }
}
