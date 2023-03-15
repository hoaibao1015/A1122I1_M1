import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng 1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Nhập các phần tử của mảng 1: ");
        for (int i = 0; i < n1; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Nhập số phần tử của mảng 2: ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Nhập các phần tử của mảng 2: ");
        for (int i = 0; i < n2; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        int n3 = scanner.nextInt();
        int[] arr3 = new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr3[i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr3[i];
        }
        System.out.println("Mảng sau khi gọp là: ");
        for (int i = 0; i < n1+n2; i++) {
            System.out.println(arr3[i] );
        }
    }
}
