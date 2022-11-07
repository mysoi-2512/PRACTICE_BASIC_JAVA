import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên dạng số
// Sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.

public class CONDITION_EXAM_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        // Kiểm tra xem số đó có lớn hơn 9 không, chư lớn hơn 9 thì không biết cách làm :'(
        if (n>9) {
            System.out.print("Nhập số nhỏ hơn chín thôi bà nội");
        } else {
            switch (n){
                case 0: System.out.println("Không");
                    break;
                case 1: System.out.println("Một");
                    break;
                case 2: System.out.println("Hai");
                    break;
                case 3: System.out.println("Ba");
                    break;
                case 4: System.out.println("Bốn");
                    break;
                case 5: System.out.println("Năm");
                    break;
                case 6: System.out.println("Sáu");
                    break;
                case 7: System.out.println("Bảy");
                    break;
                case 8: System.out.println("Tám");
                    break;
                case 9: System.out.println("Chín");
                    break;
            }

        }

    }
}
