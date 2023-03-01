import java.util.Scanner;

public class Quydoi {
    public static void main(String[] args) {
        double vnd = 24205;
        double usd;
        Scanner scanner=new  Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Giá trị VNĐ là: "+quydoi);
    }

}