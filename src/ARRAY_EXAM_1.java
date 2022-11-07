import java.util.Scanner;

//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.

public class ARRAY_EXAM_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        double SUM = 0;

        System.out.print("Nhap vao so nguyen n: ");
        n = scanner.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < n ; i++) {
            System.out.print("Nhap vao so nguyen thu " + (i+1) +" :");
            array[i] = scanner.nextDouble();
            SUM += array[i];
        }

        double AVG = SUM / n;
        System.out.println("Gia tri trung binh cua mang la: " + AVG);
    }
}
