package Phuong_Trinh_Bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        do {
            System.out.println("Nhập hệ số bậc 2 : ");
             a = scanner.nextDouble();
            if (a == 0)
                System.out.println("Vui lòng nhập khác 0");
        } while (a==0);

        System.out.println("Nhập hệ số bậc 1 : ");
         b = scanner.nextDouble();
        System.out.println("Nhập hằng số tự do : ");
         c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("cac so vua nhap vao \n" + quadraticEquation.display());
        quadraticEquation.getRoot();
    }
}
