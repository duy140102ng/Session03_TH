import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kq = "";
        System.out.println("Bạn muốn nhập bao nhiêu số nguyên ( Nhập 0 để kết thúc): ");
        int number = sc.nextInt();
        if (number == 0){
            System.out.println("Kết thúc");
            return;
        }
        for ( int i = 0 ; i < number ; i++){
            System.out.println("Nhập số nguyên thứ " + (i+1)+ " :");
            int number1 = sc.nextInt();
            if (number1 % 3 ==0){
                kq += number1 + " ";
            }
        }
        System.out.println("Các số nguyên chia hết cho 3 là: " +kq);
    }
}
