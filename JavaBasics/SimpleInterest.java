package JavaBasics;
import java.util.*;
public class SimpleInterest{
    public static void main(String args[]){
    float p,r,t,si;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Principle : ");
    p=sc.nextFloat();
    System.out.print("Enter rate : ");
    r=sc.nextFloat();
    System.out.print("Enter Time : ");
    t=sc.nextFloat();
    sc.close();
    si=(p*r*t)/100;
    System.out.println("Simple interest is : "+si);
    }
}
