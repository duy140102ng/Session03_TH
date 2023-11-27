import java.util.Scanner;

public class Bai_demo_trenlop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int sum;
        int n = 0;
        do {
            System.out.println("****************MENU****************");
            System.out.println("1. Nhập vào một số nguyên (n)");
            System.out.println("2. In ra các số chẵn từ 1-n và tính tổng");
            System.out.println("3. Kiểm tra n có phải là số nguyên tố không");
            System.out.println("4. Kiểm tra n có phải là số hoàn hảo không");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số nguyên n: ");
                    n = sc.nextInt();
                    break;
                case 2:
                    sum = 0;
                    System.out.println("Các số nguyên chẵn từ 1 - " +n+ " là: ");
                    for ( int  i = 1 ; i <= n; i++){
                        if (i%2==0){
                            System.out.printf("%d\t", i);
                            sum += i;
                        }
                    }
                    System.out.println("\nTổng các số chẵn là: " +sum);
                    break;
                case 3:
                    if (n <=1){
                        System.out.println(n+" Không phải là số nguyên tố");
                    }
                    for (int j = 2 ; j <= n/2 ; j++){
                        if (n%j==0){
                            System.out.println(n+" Không phải là số nguyên to");
                        }else {
                            System.out.println(n+ " Là số nguyên tố");
                        }
                    }
                    break;
                case 4:
                    sum = 0;
                    for (int i = 1; i < n ; i++) {
                        if (n % i == 0){
                            sum +=i;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn 1-5");
            }
        } while (choice != 5);
    }
}
