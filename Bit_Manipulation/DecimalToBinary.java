import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimal2Binary(n);
    }
    public static void decimal2Binary(int n){
        String binary = "";
        while(n>0){
          int remainder = n % 2;
          char digit =(remainder == 0)? '0':'1' ;
          binary = digit + binary;
          n = n/2;
        }
        
        System.out.println("Binary Equivalent : " + binary);  


    }
}
