import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
   public static void binarySearch(int arr[], int first, int last, int key){  
      int mid = (first + last)/2;  
      while( first <= last ){  
         if ( arr[mid] < key ){  
           first = mid + 1;     
         }else if ( arr[mid] == key ){  
           System.out.println("Element is found at index: " + mid);  
           break;  
         }else{  
            last = mid - 1;  
         }  
         mid = (first + last)/2;  
      }  
      if ( first > last ){  
         System.out.println("Element is not found!");  J
      }  
    }

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements in array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter elements of array ");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      System.out.println("Sorted Array:");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println("");

      System.out.print("Enter a search element : ");
      int key = sc.nextInt();
      sc.close();
      int last = arr.length - 1;
      int first = 0;
      binarySearch(arr, first, last, key);
   }
}