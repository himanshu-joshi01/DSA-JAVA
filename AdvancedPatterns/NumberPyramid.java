import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        sc.close(); // closing the scanner object to avoid resource leakage
                    // as it is not used anymore after this point
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // for spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

}
