import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Các số chẵn là: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
                sum += i;
            }
        }
        System.out.println("\nTổng các số chẵn là: " + sum);
    }
}



