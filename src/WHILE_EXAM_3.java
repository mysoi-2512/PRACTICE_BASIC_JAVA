import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//In ra tất cả số nguyên tố trong khoảng từ 0 - n.

public class WHILE_EXAM_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n;
        boolean soNguyenTo = false;

        System.out.print("Nhap vao so nguyen n: ");
        n = scanner.nextLong();

        if (n == 1 || n == 0) {
            System.out.println(" ");
        } else if (n == 2) {
            System.out.println("2");
        } else
            for (int i = 3; i <= n; i++) {
                soNguyenTo = true;

                for (int j = 2; j < i; j++){
                    if (i % j == 0) {
                        soNguyenTo = false;
                        break;
                    }
                }
                if (soNguyenTo == true) {
                    System.out.print(i + ",");
                }

            }
    }
}
