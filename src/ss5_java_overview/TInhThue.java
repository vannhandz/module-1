package ss5_java_overview;

import java.util.Scanner;

public class TInhThue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tên sp: ");
        String name = sc.nextLine();
        System.out.print("Nhap sl: ");
        int quantity = sc.nextInt();
        System.out.print("Nhap đơn giá: ");
        double price = sc.nextDouble();
        double sum = price * quantity;
        System.out.println("tên sp: " + name);
        System.out.println("tổng tiền: " + sum);
        System.out.println("VAT:" + (sum * 0.1));


    }
}
