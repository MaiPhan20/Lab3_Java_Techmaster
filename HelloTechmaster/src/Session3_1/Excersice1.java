package Session3_1;

public class Excersice1 {
    public static void main(String[] args) {
        String chuoi = "Hello every one";
        char kyTu = 'e';
        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
        System.out.println("Index 'e': "+chuoi.indexOf(kyTu));

    }
}
