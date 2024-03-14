import java.util.*;

    public class PairsInArray {
        public static void printPairs(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                }
                System.out.println("");
            }
        }
    
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter elements of array: ");
   for(int i=0;i<arr.length;i++){
     arr[i] = sc.nextInt(); 
   }
   sc.close();
   printPairs(arr);
}
}

