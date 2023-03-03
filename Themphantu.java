import java.util.Scanner;

public class Themphantu {
    public static void main(String[] args) {
        int i,j,d;
        int x,vitrix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng = : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n+1];
        for (i = 1; i <= n; i++) {
            System.out.println("nhập vào phần tử thứ " + i + " của mảng");
            a[i - 1] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập vào phần tử cần  chèn");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vao vị trí muốn chèn");
        do {
            vitrix = Integer.parseInt(scanner.nextLine());
            if (vitrix<1 || vitrix>n-1) System.out.println("moi nhap lai : ");
        }while (vitrix<1 || vitrix>n-1);
        System.out.println("mảng trước khi xóa là : ");
        for (i = 1; i <= n; i++) {
            System.out.print(a[i - 1] + "\t");
        }
        for( i=n; i>vitrix ; i--)
        {
            a[i] = a[i-1];
        }
        a[vitrix]=x;
        System.out.println("\nmảng sau khi xóa là : ");
        for (i = 1; i <= n+1; i++) {
            System.out.print(a[i - 1] + "\t");
        }
    }
}
