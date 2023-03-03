import java.util.Scanner;

public class Xoa_phan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng = : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n];
        int i, j;
        int d = 0;
        for (i = 1; i <= n; i++) {
            System.out.println("nhập vào phần tử thứ " + i + " của mảng");
            a[i - 1] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập vào phần tử cần xóa");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("mảng trước khi xóa là : ");
        for (i = 1; i <= n; i++) {
            System.out.print(a[i - 1] + "\t");
        }
        for (i = 1; i <= n; i++) {
            if (a[i - 1] == x) {
                d += 1;
                System.out.println("\n phần tử x xuất hiện ở vị trí " + i + " của mảng");
                for (j = i-1; j < n-1; j++) {
                    a[j] = a[j+1];
                    a[j+1]=0;
                }
            }
        }
        if (d == 0) System.out.println("không có phần tử này trong mảng");
        else {
            System.out.println("mảng sau khi xóa là : ");
            for (i = 1; i <= n-d; i++) {
                System.out.print(a[i - 1] + "\t");
            }
        }
    }
}
