import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu số nguyên (Nhập 0 để thoát): ");
        int number = sc.nextInt();
        int sumOdd = 0;
        if (number == 0) {
            System.out.println("Bạn đã thoát chương trinh! Cảm ơn");
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Mời bạn nhập số thứ " + (i + 1) + " :");
            int number1 = sc.nextInt();
            if (number1 % 2 != 0) {
                sumOdd += number1;
            }
        }
        System.out.println("Tổng các số lẻ bạn vừa nhập là: " + sumOdd);
    }
}
