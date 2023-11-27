import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("********************Breakfast Menu***************");
            System.out.println("1. Phở tôm hùm");
            System.out.println("2. Phở bò Kobe");
            System.out.println("3. Phở gà Việt Nam");
            System.out.println("4. Xôi trứng thịt");
            System.out.println("5. Bánh mỳ trứng");
            System.out.println("6. Mỳ tôm không người lái");
            System.out.println("7. Thoát");
            System.out.println("Mời bạn chọn món: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn món ..., vui lòng chờ trong giây lát");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn món ..., vui lòng chờ trong giây lát");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn món ..., vui lòng chờ trong giây lát");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn món ..., vui lòng chờ trong giây lát");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn món ..., vui lòng chờ trong giây lát");
                    break;
                case 6:
                    System.out.println("Bạn vừa chọn món ..., vui lòng chờ trong giây lát");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Vui lòng chọn món từ 1-7");
                    break;
            }
        }
        while (choice != 7);
    }
}
