import java.util.Scanner;

public class Showdrawings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============menu============");
        System.out.println("1 -hình Chữ Nhật ");
        System.out.println("2 -hình tam giác vuông ");
        System.out.println("3 -hình tam giác cân");
        System.out.println("4 - thoát ");
        System.out.println("=============================");
        String n;
        do {
            n = scanner.nextLine();
            switch (n) {
                case "1":
                    System.out.println("hình Chữ Nhật ");
                    System.out.println("nhập chiều dài");
                    int d = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập chiều rộng  ");
                    int r = Integer.parseInt(scanner.nextLine());
                    int i, j;
                    for (i = 1; i <= d; i++) {
                        for (j = 1; j <= r; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case "2":
                    System.out.println("hình tam giác vuông ");
                    System.out.println("mời nhập chiều cao =  ");
                    int cc = Integer.parseInt(scanner.nextLine());
                    for (i = 1; i <= cc; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case "3":
                    System.out.println("hình tam giác cân \n");
                    System.out.println("mời nhập chiều cao =  ");
                    int cc2 = Integer.parseInt(scanner.nextLine());
                    for (i = 1; i <= cc2; i++) {
                        for (j = 1; j <= cc2 - i; j++) {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case "4":
                    System.out.println("thoát  ");
                    break;
                default:
                    System.out.println("bạn đã  nhập sai mời nhập lại ");
            }
            if (n == "1" || n == "2" || n == "3") System.out.println(" lựa chọn tiếp theo ");
        } while (n == "4");
    }
}
