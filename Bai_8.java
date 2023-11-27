import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int n = sc.nextInt();
        int choice;
        int sum = 0;
        do {
            System.out.println("**********************PRACTICE**********************\n" +
                    "1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)\n" +
                    "2. In các số nhỏ hơn n và tính tổng\n" +
                    "3. In ra các ước số chẵn của n\n" +
                    "4. In ra các ước số lẻ và số lượng các ước lẻ của n\n" +
                    "5. In ra ước số lẻ lớn nhất của n\n" +
                    "6. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Dãy số chia hết cho 2 giảm dần từ " + n + " là: ");
                    for (int i = n; i >= 1; i--) {
                        if (i % 2 == 0) {
                            System.out.printf("%d\t", i);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Các số nhỏ hơn " + n + " là: ");
                    for (int i = n; i >= 0; i--) {
                        System.out.printf("%d\t", i);
                        sum += i;
                    }
                    System.out.println("\nTổng các số là: " + sum);
                    break;
                case 3:
                    System.out.println("Các ước số chẵn của " + n + " là: ");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 == 0) {
                            System.out.printf("%d\t", i);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    int quantity = 0;
                    System.out.println("Các ước số lẻ của " + n + " là: ");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            quantity++;
                            System.out.printf("%d\t", i);
                        }
                    }
                    System.out.println("\nSố lượng các ước lẻ của " + n + " là: " + quantity);
                    break;
                case 5:
                    int number = 1;
                    for (int i = n-1; i >=1; i--) {
                        if (n % i == 0 && i % 2 != 0) {
                            number = i;
                            break;
                        }
                    }
                    System.out.println("Ứoc số lẻ lớn nhất của " + n + " là: "+number);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn từ 1-6");
            }
        } while (choice != 6);
    }
}
