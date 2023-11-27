import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice, max, bcnn = 1;
        System.out.println("Nhập vào số nguyên thứ nhất: ");
        int number1 = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai: ");
        int number2 = sc.nextInt();
        do {
            System.out.println("***********************CACULATOR*********************");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ưóc chung lơn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    int sum = number1 + number2;
                    System.out.println("Tổng của hai số là: " +number1 + " + " + number2 + " = " +sum);
                    break;
                case 2:
                    int hieu = number1 - number2;
                    System.out.println("Hiệu của hai số là: " +number1 + " - " + number2 + " = " +hieu);
                    break;
                case 3:
                    int tich = number1 * number2;
                    System.out.println("Tích của hai số là: " +number1 + " * " + number2 + " = " +tich);
                    break;
                case 4:
                    float thuong = (float) number1 / number2;
                    System.out.println("Thương của hai số là: " +number1 + " / " + number2 + " = " +thuong);
                    break;
                case 5:
                    int soDu = number1 % number2;
                    System.out.println("Số dư của hai số sau khi chia là: " +number1 + " % " + number2 + " = " +soDu);
                    break;
                case 6:
                    while (number1 != number2){
                        if (number1>number2){
                            number1 = number1 - number2;
                        }else {
                            number2 = number2 - number1;
                        }
                    }
                    System.out.println("Ứớc chung lớn nhất của hai số là: " +number1);
                    break;
                case 7:
                    if (number1 ==0 || number2 == 0){
                        System.out.println("Không có bội chung nhỏ nhất");
                    }else {
                        if (number1 > number2){
                            max = number1;
                        }else {
                            max = number2;
                        }
                        int i = max;
                        while (true){
                            if ( i % number1 == 0 && i % number2 == 0){
                                bcnn = i;
                                break;
                            }
                            i +=max;
                        }
                        System.out.println("Bội chung nhỏ nhất là: " +bcnn);
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn chức năng 1-8");
            }
        }while (choice!=8);
    }
}
