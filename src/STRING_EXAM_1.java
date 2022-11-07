import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.

public class STRING_EXAM_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String chuoi;
        System.out.print("Nhap vao mot chuoi: ");
        chuoi = scanner.nextLine();

        char kyTu;
        System.out.print("Nhap ky tu can kiem tra: ");
        kyTu = scanner.nextLine().charAt(0);

        char mangKyTu[] = chuoi.toCharArray();

        for (int i = 0; i < chuoi.length(); i++) {
            if (mangKyTu[i] == kyTu){
                System.out.println("Co");
                return;
            }
        }

        System.out.println("Khong");

    }
}
