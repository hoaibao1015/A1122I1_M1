import java.util.Arrays;
import java.util.Scanner;

public class Nhonhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n;
        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("n > 0, xin kiểm tra lại!!!");
            }
        } while (n <= 0);
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử arr[" + i + "] của mảng : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa nhập vào: " + Arrays.toString(arr));
        int min = arr[0];
        for (i = 1; i < n; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.print("Phần tử nhỏ nhất trong mảng vừa nhập vào là: " + min);
    }
}
