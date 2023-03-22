import java.util.Scanner;

public class Tongdcmtv {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao so bac cua ma tran");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) System.out.println("ban da nhap sai, hay nhap lai voi n >=0");
        } while (n < 0);
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arr[" + i + "," + j + "]=:");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("ma tran vua nhap la");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) sum += arr[i][j];
            }
        }
        System.out.println("tong cac phan tu nam tren duong cheo chinh la " + sum);
    }
}
