import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered Number of lines in diamond : ");
        int n = sc.nextInt(); // Input the number of rows in diamond pa
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // For spaces
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* "); // For stars
            }
            System.out.println(); // Moves to next line after each row is printed
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("  "); // Prints stars in reverse order
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}