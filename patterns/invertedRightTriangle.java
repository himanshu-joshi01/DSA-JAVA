import java.util.*;

public class invertedRightTriangle{
    public static void main(String args[]){
        System.out.println("enter no. of line in triangle");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        
for(int i=0;i<n;i++)
{
    for(int j=n;j>i;j--)
    {
      System.out.print("*");
    }           
    System.out.println();
}
    }
}

