package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        System.out.print("nhap vap nam sinh: ");
        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();
        System.out.println(Year.now().getValue()-year);

    }
}
