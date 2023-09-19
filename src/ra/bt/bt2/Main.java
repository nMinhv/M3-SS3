package ra.bt.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1: tích của 2 số");
            System.out.println("2: giai thừa của 1 số");
            System.out.println("3: khai căn và làm tròn tới 3 chữ số sau dấu phẩy");
            System.out.println("4: đếm số ước của 1 số nguyên dương nhập vào");
            System.out.println("5: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào 2 số");
                    float fN = Float.parseFloat(sc.nextLine());
                    float sN = Float.parseFloat(sc.nextLine());
                    System.out.println("Tích của " + fN + " * " + sN + " là :" + fN * sN);
                    break;
                case 2:
                    ;
                    int rst = 1;
                    System.out.println("Nhập vào số muốn tính giai thừa");
                    int gt = sc.nextInt();
                    if (gt >= 1) {
                        for (int i = 1; i <= gt; i++) {
                            rst *= i;
                        }
                        System.out.println("giai thừa của " + gt + " là " + rst);
                    } else {
                        System.out.println("invalid");
                    }
                    break;
                case 3:
                    System.out.println("nhập vào số muốn tính căn làm tròn đến 3 dấu phẩy");
                    float nSqrt = sc.nextFloat();
                    if (nSqrt > 0) {
//                        nSqrt = (float) Math.round(Math.sqrt(nSqrt) * 1000) / 1000;
//                        System.out.println(nSqrt);
                        float sqrtOn = (float) Math.sqrt(nSqrt);
                        System.out.printf("căn bậc 2 của %.3f = %.3f\n",nSqrt, sqrtOn);
                    } else {
                        System.out.println("số phải lớn hơn 0");
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào số nguyên dương muốn tính số ước");
                    int num = sc.nextInt();
                    int count = 0;
                    if (num > 0) {
                        for (int i = 1; i <= num; i++) {
                            if (num % i == 0) {
                                count++;
                            }
                        }
                        System.out.println("Số ước của " + num + " là " + count);
                    }
                    break;
                case 5:
                    System.out.println("exit program..");
            }
        } while (choice != 5);
    }
}
