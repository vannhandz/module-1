package ss6;

import java.util.Scanner;

public class TinhTb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap diem toan: ");
        double toan = sc.nextInt();
        System.out.print("nhap diem toan: ");
        double ly=sc.nextInt();
        System.out.print("nhap diem toan: ");
        double hoa=sc.nextInt();

        System.out.println("điểm tb: "+(toan + ly + hoa)/3);
    }
}
