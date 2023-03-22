import java.util.Scanner;

public class Tinhtong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] arr = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Mảng đầu vào:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Nhập chỉ số của cột cần tính tổng (bắt đầu từ 0): ");
        int column = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column];
        }

        System.out.println("Tổng các phần tử trong cột " + column + " is " + sum);
    }
}

