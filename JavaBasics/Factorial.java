
import  java.util.*;

public class Factorial {
            public static void main(String[] args) {
                double fact=1;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number:");
                double n =sc.nextDouble();
                sc.close();
                  if (n<=0) {
                    System.out.println("Factorial is not defined for negative numbers");
                }else
                if(n==0 || n==1){
                 System.out.print("The factorial of "+n+" is "+1);
                }
                else{
                for(double i=n;i>1;i--){
                    fact *=i;
                }
                System.out.println("Factorial of "+n+" is :"+fact);

            }
            }

    
}
