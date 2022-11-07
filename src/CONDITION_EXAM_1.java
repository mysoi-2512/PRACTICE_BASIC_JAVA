import java.util.Scanner;

        //Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên
        // In ra màn hình “Đây là số nguyên dương”
        //Nếu số vừa nhập vào là một số nhỏ hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.

public class CONDITION_EXAM_1 {
    public static void main(String[] args){

        //Nhập vào một số nguyên n
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        n = scanner.nextInt();

        //Nếu n>0 thì in ra "Đây là một số nguyên dương", ngược lại thì in ra "Đây là một số nguyên âm"
        if (n>0) {
            System.out.print("Đây là một số nguyên dương");
        }
            else {
            System.out.print("Đây là một số nguyên âm");
        }
    }


}
