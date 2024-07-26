
import java.util.*;

public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return (fib(n - 1) + fib(n - 2));

    }

    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }

    }
}
