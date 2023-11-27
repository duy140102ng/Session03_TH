import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int number1 = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int number2 = sc.nextInt();
        System.out.println("Nhập số thứ ba: ");
        int number3 = sc.nextInt();
        int choice = 0;
        int sum;
        do {
            System.out.println("**********************CACULATOR**********************\n" +
                    "1. Tổng 3 số nguyên\n" +
                    "2. Trung bình cộng của 3 số nguyên\n" +
                    "3. Số lớn nhất, nhỏ nhất trong 3 số\n" +
                    "4. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    sum = number1 + number2 + number3;
                    System.out.println("Tổng ba số " +number1 + " " + number2 + " " + number3+ " là: " +sum);
                    break;
                case 2:
                    int tbc = (number1 + number2+ number3)/3;
                    System.out.println("Trung bình cộng của ba số " +number1 + " " + number2 + " " + number3+ " là: " +tbc);
                    break;
                case 3:
                    int max = number1, min = number1;
                    if (max < number2) {
                        max = number2;
                    }
                    if (max < number3){
                        max = number3;
                    }
                    if (min > number2){
                        min = number2;
                    }
                    if (min > number3){
                        min = number3;
                    }
                    System.out.println("Số lớn nhất trong 3 số là: " +max);
                    System.out.println("Số nhỏ nhất trong 3 số là: " +min);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn lựa chọn từ 1-4!");
            }
        }while (choice != 4 );
    }
}

