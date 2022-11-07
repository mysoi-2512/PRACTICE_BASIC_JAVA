import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào mã số sinh viên
//Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9.
// Sử dụng biểu thức chính quy để ràng buộc định dạng

public class CONDITION_EXAM_5 {
    public static void main(String[] args){

        String maSoSV;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma so Sinh Vien: ");
        maSoSV = scanner.nextLine();

        if (maSoSV.matches("B\\d{7}")){
            System.out.println("Dung dinh dang");
        } else
            System.out.println("Khong dung dinh dang");

    }
}
