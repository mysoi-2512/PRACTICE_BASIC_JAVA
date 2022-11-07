import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào 5 mã số, lưu 5 mã số này vào một mảng.
//Chương trình sẽ kiểm tra xem trong 5 mã số này có mã số nào sai định dạng hay không (định dạng là “00yLxxxx” với y là số nguyên từ 2 - 5, x là số nguyên từ 0-9).
//Nếu có bất kỳ mã số nào sai định dạng thì chương trình in ra “Sai rồi” rồi kết thúc chương trình, ngược lại thì in ra “Đúng rồi”. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

public class ARRAY_EXAM_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = new String[5];

        for (int i = 0; i < 5 ; i++) {
            System.out.print("Nhap vao ma so thu " + (i+1) + " : ");
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (!array[i].matches("00[2345]L\\d{4}")){
                System.out.println("Sai roi");
            return;
            }
        }
        System.out.println("Dung roi");
    }
}
