package ss4_java_overview;

import java.util.Scanner;

public class tinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("nhap so b: ");
        double b = sc.nextDouble();

        System.out.println("tổng a + b: "+ (a+b));
        System.out.println("tổng a + b: "+ (a-b));
        System.out.println("tổng a + b: "+ (a*b));
        System.out.println("tổng a + b: "+ (a/b));

    }
}
