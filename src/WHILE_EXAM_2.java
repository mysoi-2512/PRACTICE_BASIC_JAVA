import java.util.Scanner;

//Viết chương trình để nhập nhập một số nguyên
// Tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.

public class WHILE_EXAM_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Nhap vao so nguyen n: ");
        n = scanner.nextInt();

        int i;
        for (i=1; i<=20; i++) {
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
