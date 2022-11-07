import java.util.Scanner;

//Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này có xuất hiện số hay không.
//Nếu có tin ra “Có”, ngược lại, in ra “Không”.

public class STRING_EXAM_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String chuoi;
        System.out.print("Nhap vao mot chuoi: ");
        chuoi = scanner.nextLine();

        if (chuoi.matches(".*\\d.*")){
            System.out.println("Co");
        } else
            System.out.println("Khong");
    }
}
