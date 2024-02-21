import java.util.*;

public class OneZeroTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for binary triangle:");
        int n = sc.nextInt();
        sc.close();
        // creating a 2D array to store the binary numbers in each row
        int bin = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(bin);
                if (bin == 1) {
                    bin = 0;
                } else {
                    bin = 1;
                }
            }
            System.out.println();
        }
    }

}
