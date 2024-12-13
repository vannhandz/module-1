package ss6;

import java.util.Scanner;

public class BienSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap bien so: ");
        int n = sc.nextInt();

        int sum = n % 10;
        n /= 10;

        sum += n % 10;
        n /= 10;

        sum += n % 10;
        n /= 10;

        sum += n % 10;
        n /= 10;

        sum += n % 10;
        n /= 10;

        System.out.println("nut bien so: "+sum % 10);
    }
}
