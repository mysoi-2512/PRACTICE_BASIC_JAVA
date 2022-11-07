import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên dương n
// Tính tổng tất cả số chẵn trong khoảng từ 0 - n.

public class WHILE_EXAM_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        long SUM = 0;

        System.out.print("Nhap so nguyen duong: ");
        n = scanner.nextInt();

        int i;
        for (i=0; i <= n; i++) {
            if (i % 2 == 0) {
                SUM = SUM + i;
            }
        }
        System.out.print("Tong so chan tu 0-n la: " + SUM);

    }
}
