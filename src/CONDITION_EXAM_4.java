import java.util.Scanner;

//Viết chương trình cho phép nhập vào 3 số
//Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.

public class CONDITION_EXAM_4 {
    public static void main(String[] args){

        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thực thứ nhất: ");
        a = scanner.nextDouble();

        System.out.print("Nhập số thực thứ hai: ");
        b = scanner.nextDouble();

        System.out.print("Nhập số thực thứ ba: ");
        c = scanner.nextDouble();

        if (a<=0 || b<=0 || c<=0) {
            System.out.print("Nhập số thực lớn hơn 0 nha bà nội, báo không hà");
        } else {
            if (a * a + b * b == c * c || c * c + b * b == a * a || c * c + a * a == b * b) {
                System.out.print("3 số này là 3 cạnh của 1 tam giác vuông");
            } else
                System.out.print("3 số này không phải là 3 cạnh của 1 tam giác vuông");
        }
    }

}
