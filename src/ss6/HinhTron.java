package ss6;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        double r = sc.nextInt();
        System.out.println("chu vi: "+(2*Math.PI*r));
        System.out.println("chu vi: "+(r*Math.PI*r));
    }
}
