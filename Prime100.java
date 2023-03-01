
import java.util.Scanner;

public class Prime100 {

    public static void main(String[] args) {

        int count = 0;
        int N = 2;

        while (count < 100){
            if(isPrime(N)){
                System.out.print(N + " ");
                count++;
            }

            N++;
        }
    }

    private static boolean isPrime(int N) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(N % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}