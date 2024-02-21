
import java.util.*;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;

        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.println("Enter numbers :");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (number[i] % 2 == 0) {
                evensum += number[i];
            } else {
                oddsum += number[i];
            }

        }
        sc.close();
        System.out.println("Sum of even numbers is " + evensum);
        System.out.println("Sum of odd numbers is " + oddsum);
    }
}