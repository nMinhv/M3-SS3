import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // loop
        // các loại vòng lặp chính
        // for i
//        for (int i = 0; i < 10 ; i--) {
//            // khối lệnh thực thi
//        }
        // while
//        int n = 1;
//        while (n!=5) {
//            System.out.println(n);
//            n++;
//        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter string with length from 12 to 20");
            String str = sc.nextLine();
            if (str.length() >= 12 && str.length() <= 20) {
                System.out.println("String you just Enter : " + str + "with length is : " + str.length());

                while (true) {
                    System.out.println("enter number > 18");
                    int num = Integer.parseInt(sc.nextLine());
                    if (num > 18) {
                        System.out.println("number you just enter " + num);
                        String rs = "";
                        while (true) {
                            System.out.println("enter character 'O' ");
                            String strO = sc.nextLine();
                            rs += strO;
                            if (strO.length() == 1) {
                                if (strO.equals("O")) {
                                    System.out.println("String you just enter " + rs);
                                    return;
                                }else {
                                    System.err.println("invalid");

                                }
                            } else {
                                System.err.println("invalid");
                            }
                        }
                    } else {
                        System.out.println("invalid");
                    }
                }
            } else {
                System.err.println("invalid");
            }
        }
    }
}