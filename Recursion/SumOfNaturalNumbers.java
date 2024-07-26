import java.util.Scanner;

public class SumOfNaturalNumbers{

    public static int sum(int n){
        if(n<1) return -1;
       if(n==1) return 1;
       return n+sum(n-1);
    }
    public static void main(String args[]){

            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n= sc.nextInt();
            System.out.println( "sum of "+ n + " natural numbers : " +sum(n));
        
       
    }
}
