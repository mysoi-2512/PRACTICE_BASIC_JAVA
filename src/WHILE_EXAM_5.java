import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
//Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
// Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

public class WHILE_EXAM_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] mSSV = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap MSSV thu " + (i+1) + ":");
            mSSV[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (mSSV[i].matches("B170\\d{4}")){
                System.out.println("MSSV thu " + (i+1) + " hop le");
            } else
                System.out.println("MSSV thu " + (i+1) + " khong hop le");
        }
    }
}
