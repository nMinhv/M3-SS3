package ra.th.th2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interesRate = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số tiền vay");
        money = sc.nextInt();
        System.out.println("nhập vào số tháng");
        month = sc.nextInt();

        double total =0;
        for (int i = 0; i < month; i++) {
            total += money*(interesRate/100)/12* month;
        }
        System.out.println("tổng số tiền phải trả là: " + total);
    }
}
