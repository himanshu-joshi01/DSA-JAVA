
import java.util.*;

public class FactorialOfNum {

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = n * fact(n - 1);
        return fact;
    }

    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " : " + fact(n));

    }
}
