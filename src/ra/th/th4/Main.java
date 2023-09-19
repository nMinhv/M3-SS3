package ra.th.th4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("menu");
            System.out.println("1. Hình tam giác");
            System.out.println("2. Hình Vuông");
            System.out.println("3. Hình Chữ Nhật");
            System.out.println("4. Thoát");
            System.out.println("nhập lựa chọn:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("* * * * *");
                    System.out.println("* * * * ");
                    System.out.println("* * * ");
                    System.out.println("* * *");
                    System.out.println("* * ");
                    System.out.println("* ");
                    break;
                case 2:
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 3:
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("số ko hợp lệ");
            }
        } while (choice != 4);
    }
}
