import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
//Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi, nếu không thì in ra “Không tồn tại trong chuỗi”.

public class STRING_EXAM_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String chuoi;
        System.out.print("Nhap vao mot chuoi: ");
        chuoi = scanner.nextLine();

        char kyTu;
        System.out.print("Nhap vao ly tu can kiem tra: ");
        kyTu = scanner.nextLine().charAt(0);

        char[] mangKyTu = chuoi.toCharArray();

        boolean tonTai = false;

        for (int i = 0; i < mangKyTu.length; i++) {
            if (mangKyTu[i] == kyTu) {
                System.out.println("Ky tu nam o vi tri: " + i);
                tonTai = true;
            }
        }

        if (tonTai = false) {
            System.out.println("Khong ton tai trong chuoi");
        }
    }
}
