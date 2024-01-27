package JavaBasics;
import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        if(n == 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        
        System.out.println(n + " is a prime number.");
    }
}
    
    

