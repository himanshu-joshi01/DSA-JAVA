package JavaBasics;

import java.util.Scanner;

public class MaxOf3Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        System.out.println("Enter the third number:");
        c=sc.nextInt();
        sc.close();
            max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The maximum value is "+max);


    }   
}
