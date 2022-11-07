import java.util.Scanner;

//Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.

public class CONDITION_EXAM_3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double x, y ,z;

        System.out.print("Nhap so thu nhat: ");
        x = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        y = scanner.nextDouble();

        System.out.print("Nhap so thu ba: ");
        z = scanner.nextDouble();

        if (x<=0 || y<=0 || z<=0){
            System.out.print("Nhap so lon hon 0 nha ba noi");
        } else if (x+y>z && x+z>y && y+z>x){
            System.out.print("3 so nay la 3 canh cua 1 tam giac");
        } else
            System.out.print("3 so nay khong la 3 canh cua 1 tam giac");
    }
}
