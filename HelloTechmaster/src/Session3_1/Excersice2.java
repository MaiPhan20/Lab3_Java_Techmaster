package Session3_1;

import java.util.Scanner;

public class Excersice2 {
    public static void main(String[] args) {
        String nhapChuoi;
        char kiTu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi: ");
        nhapChuoi = scanner.nextLine();

        for (int i = 0; i < nhapChuoi.length(); i++) {
            kiTu = nhapChuoi.charAt(nhapChuoi.length() - i - 1);

            if (nhapChuoi.charAt(i) == kiTu) {
                System.out.println("Đây là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Đây  không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}
