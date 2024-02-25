import java.util.*;


public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int rev=0;
        sc.close();

        while(num > 0) {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
            }
        
        System.out.println("Reversed Number is : "+rev);
    }
    
}
