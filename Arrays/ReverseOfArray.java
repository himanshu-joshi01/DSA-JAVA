
import java.util.*;
public class ReverseOfArray {

    public static void Reverse(int arr[]){
        int first=0, last=arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }

    }  
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
            System.out.println("enter elements of array ") ;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }    
            Reverse(arr);
            sc.close();
            System.out.print("Reversed Array is : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }     
            System.out.println("");

}
}
