import java.util.Scanner;

public class BinaryToDecimal {
     public static void main(String[] args){
        System.out.print("Enter the Binary : ");
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        binary2Decimal(binary);
    }

    public static void binary2Decimal(String binary){
              int n = 0 ;
              for(int i=0 ; i<binary.length() ; i++){
                if(binary.charAt(i) == '1'){
                n += Math.pow(2,binary.length()-1-i);
              }
            }
            System.out.println("Decimal Value : " + n);
    }
}

