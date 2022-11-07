import java.util.Scanner;

//Viết chương trình cho phép nhập vào một chuỗi
//Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
//In ra số lần đó.

public class STRING_EXAM_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String chuoi;
        System.out.print("Nhap vao mot chuoi: ");
        chuoi = scanner.nextLine();

        char kyTu = 'a';
        int SUM = 0;

        char[] mangKyTu = chuoi.toCharArray();

        for (int i = 0; i < chuoi.length(); i++) {
            if (mangKyTu[i] == kyTu){
                SUM+=1;
            }
        }

        if (SUM == 0){
            System.out.print("a khong xuat hien trong chuoi");
        } else
            System.out.print("a xuat hien trong chuoi " + SUM + " lan");

    }
}
